package springBootMVCShopping.service.myPage;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;

@Service
public class MemberPwModifyService {
	@Autowired
	PasswordEncoder passwordEncoder;
	public int execute(String  memberPw, HttpSession session) {
		int i = 0;
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(memberPw, auth.getUserPw())) i = 1;
		return i;
	}
}
