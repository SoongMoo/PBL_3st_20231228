package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springBootMVCShopping.service.item.CartListService;
import springBootMVCShopping.service.item.CartQtyDownService;
import springBootMVCShopping.service.item.GoodsCartDelsService;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	CartListService cartListService;
	@Autowired
	CartQtyDownService cartQtyDownService;
	@GetMapping("cartList")
	public String cartList(Model model, HttpSession session) {
		cartListService.execute(model, session);
		return "thymeleaf/corner/cartList";
	}
	@GetMapping("cartQtyDown")
	@ResponseBody
	public void cartQtyDown(String goodsNum, HttpSession session )  {
		cartQtyDownService.execute(goodsNum, session);
	}
	@Autowired
	GoodsCartDelsService goodsCartDelsService; 
	@GetMapping("cartDel")
	public String cartDel(String goodsNums[], HttpSession session) {
		goodsCartDelsService.execute(goodsNums, session);
		return "redirect:cartList";
	}
}
