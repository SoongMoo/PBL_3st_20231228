package springBootMVCShopping.service.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.LoginMapper;

@Service
public class UserLoginService {
	@Autowired
	LoginMapper loginMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(LoginCommand loginCommand, HttpSession session
			, BindingResult result, HttpServletResponse response) {
		String userId = loginCommand.getUserId();
		String userPw = loginCommand.getUserPw();
		AuthInfoDTO auth = loginMapper.loginSelect(userId);
		if(auth != null) {
			if(passwordEncoder.matches(userPw, auth.getUserPw())) {
				if(auth.getUserEmailCheck() == null) {
					result.rejectValue("userId", "loginCommand.userId","이메일 확인을 하지않았습니다.");
				}else {
					System.out.println("비밀번호가 일치");
					session.setAttribute("auth", auth);
					if(loginCommand.isIdStore()) {
						Cookie cookie = new Cookie("idStore", loginCommand.getUserId());
						cookie.setPath("/");
						cookie.setMaxAge(60*60*24*30);
						response.addCookie(cookie);
					}else {
						Cookie cookie = new Cookie("idStore", "");
						cookie.setPath("/");
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
					if(loginCommand.isAutoLogin()) {
						Cookie cookie = new Cookie("autoLogin", loginCommand.getUserId());
						cookie.setPath("/");
						cookie.setMaxAge(60*60*24*30);
						response.addCookie(cookie);
					}
				}
			}else {
				System.out.println("비밀번호가 일치하지 않을 때");
				result.rejectValue("userPw", "loginCommand.userPw"
						,"비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않을 때");
			result.rejectValue("userId", "loginCommand.userId","아이디가 존재하지 않습니다.");
		}
	}
}
