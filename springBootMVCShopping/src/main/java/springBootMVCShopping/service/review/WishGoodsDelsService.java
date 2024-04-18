package springBootMVCShopping.service.review;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.mapper.WishMapper;

@Service
public class WishGoodsDelsService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	WishMapper wishMapper;
	public void execute(String wishGoodsDels[], HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		wishMapper.wishDeletes(wishGoodsDels, dto.getMemberNum());
	}
}
