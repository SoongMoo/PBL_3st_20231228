package springBootMVCShopping.service.item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.CartMapper;
import springBootMVCShopping.mapper.MemberMapper;
@Service
public class GoodsCartDelsService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	CartMapper cartMapper;
	public String execute(String[] goodsNums ,  HttpSession session) {
		System.out.println(goodsNums);
		AuthInfoDTO auth  = (AuthInfoDTO)session.getAttribute("auth");
		MemberDTO dto = memberMapper.memberSelectOne(auth.getUserId());
		List<String> cs  = new ArrayList<String>();
		for(String goodsNum : goodsNums) {
			System.out.println(goodsNum);
			cs.add(goodsNum);
		}
		Map<String, Object> condition = new HashMap<String, Object>(); 
		condition.put("goodsNums", cs);
		condition.put("memberNum", dto.getMemberNum());
		int i = cartMapper.goodsNumsDelete(condition);
		if(i > 0) return "200";
		else return "000";
	}
}
