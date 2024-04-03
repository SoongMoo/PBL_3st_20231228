package springBootMVCShopping.service.help;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.UserChangePasswordDTO;
import springBootMVCShopping.mapper.FindMapper;
import springBootMVCShopping.mapper.LoginMapper;


@Service
public class FindPwService {
	@Autowired
	FindMapper findMapper;
	@Autowired
	PasswordEncoder passwordEncoder; // 암호화 시키고 
	@Autowired
	LoginMapper loginMapper;
	public void execute(String userId, String userPhone, Model model) {
		String newPw = UUID.randomUUID().toString().substring(0, 8);
		UserChangePasswordDTO dto = new UserChangePasswordDTO();
		dto.setUserId(userId);
		dto.setUserPhone(userPhone);
		dto.setUserPw(passwordEncoder.encode(newPw));
		
		AuthInfoDTO auth = loginMapper.loginSelect(userId);
		if(auth.getGrade().equals("mem")) {
			dto.setTableName("members");
			dto.setPwColumName("member_pw");
			dto.setUserIdColumName("member_id");
		}else if(auth.getGrade().equals("emp")){
			dto.setTableName("employees");
			dto.setPwColumName("emp_pw");
			dto.setUserIdColumName("emp_id");
		}
		findMapper.pwUpdate(dto);
		model.addAttribute("auth", auth);
	}
}










