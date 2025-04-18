package springBootMVCShopping.service.myPage;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
@RequiredArgsConstructor
public class MemberInfoService{
	@Autowired
	MemberMapper memberMapper; 
	public void execute(HttpSession session,Model model) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		model.addAttribute("memberCommand", dto);
		//return dto;
	}
}
