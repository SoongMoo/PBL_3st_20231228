package springBootMVCShopping.service.purchase;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsCartDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.GoodsCartMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class GoodsBuyService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	GoodsCartMapper goodsCartMapper;
	public void execute(String [] nums, HttpSession session , Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");	
		MemberDTO memDto = memberMapper.memberSelectOne(auth.getUserId());
		List<GoodsCartDTO> list 
			= goodsCartMapper.goodsCartSelectList(memDto.getMemberNum(),nums);
		model.addAttribute("list", list);
	}
}
