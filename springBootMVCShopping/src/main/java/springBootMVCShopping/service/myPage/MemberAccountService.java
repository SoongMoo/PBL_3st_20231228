package springBootMVCShopping.service.myPage;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberAccountService {
	@Autowired
	MemberMapper memberMapper;
	public Map<String, Object> execute(HttpSession session, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		//model.addAttribute("memberCommand", dto);
		map.put("memberCommand", dto);
		return map;
	}
}
