package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.service.goods.GoodsDetailViewService;

@Controller
@RequestMapping("corner")
public class CornerController {
	@Autowired
	GoodsDetailViewService goodsDetailViewService;
	@GetMapping("detailView/{goodsNum}")
	public String goodsInfo(@PathVariable("goodsNum") String goodsNum
			,Model model , HttpSession session) {
		goodsDetailViewService.execute(goodsNum, model, session);
		return "thymeleaf/corner/detailView";
	}
}
