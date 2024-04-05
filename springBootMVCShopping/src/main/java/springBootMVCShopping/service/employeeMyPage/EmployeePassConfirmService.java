package springBootMVCShopping.service.employeeMyPage;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.UserPwCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.EmployeeMyMapper;

@Service
public class EmployeePassConfirmService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmployeeMyMapper employeeMyMapper;
	public String execute(UserPwCommand userPwCommand, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(userPwCommand.getOldPw(), auth.getUserPw())){
			String userPw = passwordEncoder.encode(userPwCommand.getNewPw());
			//변경된 비밀번호를 디비에 저장한다.
			employeeMyMapper.employeePwUpdate(userPw, auth.getUserId());
			//변경된 비밀번호를 seesion에 저장한다.
			auth.setUserPw(userPw);
			return "1";
		}
		return "0";
	}
}
