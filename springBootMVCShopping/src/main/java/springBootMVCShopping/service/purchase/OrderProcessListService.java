package springBootMVCShopping.service.purchase;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class OrderProcessListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PurchaseRepository purchaseRepository;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMapper.memberSelectOne(auth.getUserId());
		List<OrderListDTO> list = purchaseRepository.orderList(memDto.getMemberNum()); 
		model.addAttribute("list", list);
	}
}
