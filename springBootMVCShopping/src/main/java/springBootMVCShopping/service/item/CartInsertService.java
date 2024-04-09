package springBootMVCShopping.service.item;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.command.CartCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class CartInsertService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	CartMapper cartMapper;
	public String execute(CartCommand cartCommand, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = null;
		try {
			dto = memberMapper.memberSelectOne(auth.getUserId());
		}catch(Exception e) {
			e.printStackTrace();
			return "000";
		}
		if(dto == null) {
			return "900";
		}else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("memberNum", dto.getMemberNum());
			map.put("cartCommand", cartCommand);
			cartMapper.cartInsert(map);
			return "200";
		}
		
	}
}
