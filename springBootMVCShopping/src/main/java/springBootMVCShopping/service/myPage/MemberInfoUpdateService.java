package springBootMVCShopping.service.myPage;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;
@Service
public class MemberInfoUpdateService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MemberMapper memberMapper;
	public Map<String, Object> execute(MemberCommand memberCommand
			, HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		if(passwordEncoder.matches(memberCommand.getMemberPw()
				, auth.getUserPw())) {
			MemberDTO dto = new MemberDTO();
			BeanUtils.copyProperties(memberCommand, dto);
			memberMapper.memberUpdate(dto);
			map.put("SUCCESS", "200");
		}else {
			map.put("SUCCESS", "999");
		}
		return map;
	}
}
