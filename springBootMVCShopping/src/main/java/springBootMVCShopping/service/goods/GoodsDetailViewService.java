package springBootMVCShopping.service.goods;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsStockDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.GoodsMapper;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.mapper.WishMapper;

@Service
public class GoodsDetailViewService {
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	WishMapper wishMapper;
	@Autowired
	MemberMapper memberMapper;
	public void execute(String goodsNum, Model model, HttpSession session) {
		goodsMapper.visitCount(goodsNum);
		GoodsStockDTO  dto = goodsMapper.goodsStockSelectOne(goodsNum);
		model.addAttribute("goodsStockCommand", dto);
		
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(auth != null) {
			MemberDTO memdto = memberMapper.memberSelectOne(auth.getUserId());
			Map<String, String> map = new HashMap<String, String>();
			map.put("goodsNum", goodsNum);
			try {
				map.put("memberNum", memdto.getMemberNum());
				int i = wishMapper.wishCountSelectOne(map);
				model.addAttribute("wish", i);
			}catch(Exception e) {
				model.addAttribute("wish", 0);
			}
		}
	}
}
