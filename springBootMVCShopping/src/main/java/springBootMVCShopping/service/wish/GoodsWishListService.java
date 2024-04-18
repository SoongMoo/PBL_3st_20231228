package springBootMVCShopping.service.wish;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.mapper.WishMapper;

@Service
public class GoodsWishListService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	WishMapper wishMapper;
	public void execute(HttpSession session, Model model) {
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO memDto = memberMapper.memberSelectOne(authInfo.getUserId());
		List<GoodsDTO> list = wishMapper.wishSelectList(memDto.getMemberNum());
		model.addAttribute("dtos", list);		
	}
}
