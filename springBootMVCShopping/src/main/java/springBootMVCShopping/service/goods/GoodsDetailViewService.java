package springBootMVCShopping.service.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.mapper.GoodsMapper;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class GoodsDetailViewService {
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	MemberMapper memberMapper;

	public void execute(String goodsNum, Model model, HttpSession session) {
		// detailView.html에 들어 갈 데이터를 가지고 옵니다.
		
	}
}
