package springBootMVCShopping.service.purchase;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.domain.PurchaseListDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.PurchaseRepository;

@Service
public class GoodsOrderService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PurchaseRepository purchaseRepository;
	@Autowired
	CartMapper cartMapper;
	public String execute(PurchaseCommand purchaseCommand,HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memdto = memberMapper.memberSelectOne(auth.getUserId());
		String purchaseNum = purchaseRepository.selectNum(); // 구매번호
		/// 구매
		PurchaseDTO dto = new PurchaseDTO();
		BeanUtils.copyProperties(purchaseCommand, dto);
		dto.setMemberNum(memdto.getMemberNum());
		dto.setPurchasePrice(purchaseCommand.getTotalPaymentPrice());
		dto.setPurchaseNum(purchaseNum);
		System.out.println("purchaseNum : " + purchaseNum);
		purchaseRepository.purchaseInsert(dto);
		// 구매리스트
		String goodsNums[] = purchaseCommand.getGoodsNums().split("-");
		PurchaseListDTO plDto = new PurchaseListDTO();
		plDto.setGoodsNums(goodsNums);
		plDto.setPurchaseNum(purchaseNum);	
		plDto.setMemberNum(memdto.getMemberNum());
		purchaseRepository.purchaseListInsert(plDto);
		
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("memberNum", memdto.getMemberNum());
		condition.put("goodsNums", goodsNums);
		cartMapper.goodsNumsDelete(condition);
		
		return purchaseNum;
	}
}
