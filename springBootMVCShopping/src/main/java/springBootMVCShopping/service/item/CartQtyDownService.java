package springBootMVCShopping.service.item;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class CartQtyDownService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	CartMapper cartMapper;
	public void execute(String goodsNum, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		cartMapper.cartQtyDown(goodsNum, dto.getMemberNum());
	}
}