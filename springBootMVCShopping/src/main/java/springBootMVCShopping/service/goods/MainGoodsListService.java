package springBootMVCShopping.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.GoodsMapper;
import springBootMVCShopping.service.StartEndPageService;

@Service
public class MainGoodsListService {
	@Autowired
	StartEndPageService startEndPageService;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(Integer page  , Model model) {
		//  PAGING
		int limit = 6;
		StartEndPageDTO sepDTO = startEndPageService.execute(limit, page, null);
		List<GoodsDTO> list = goodsMapper.allSelect(sepDTO);
		int count = goodsMapper.goodsCount(null);
		startEndPageService.execute(page, count, limit, model, null);	
		model.addAttribute("list", list);
	}
}
