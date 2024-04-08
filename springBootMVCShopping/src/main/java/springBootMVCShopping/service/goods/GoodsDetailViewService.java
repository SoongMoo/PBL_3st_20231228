package springBootMVCShopping.service.goods;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsStockDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsDetailViewService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(String goodsNum, Model model) {
		goodsMapper.visitCount(goodsNum);
		GoodsStockDTO  dto = goodsMapper.goodsStockSelectOne(goodsNum);
		model.addAttribute("goodsStockCommand", dto);
	}
}
