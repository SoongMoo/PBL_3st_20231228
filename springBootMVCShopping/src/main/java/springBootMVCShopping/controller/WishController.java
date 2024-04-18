package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.service.review.WishDelService;
import springBootMVCShopping.service.review.WishGoodsDelsService;
import springBootMVCShopping.service.wish.GoodsWishListService;

@Controller
@RequestMapping("wish")
public class WishController {
	@Autowired
	GoodsWishListService goodsWishListService;
	@Autowired
	WishGoodsDelsService wishGoodsDelsService;
	@Autowired
	WishDelService wishDelService;
	@GetMapping("wishList")
	public String wishList(HttpSession session, Model model) {
		goodsWishListService.execute(session, model);
		return "thymeleaf/wish/wishList";
	}
	@PostMapping("wishDels")
	public String goodsWishDels(
			@RequestParam("nums") String wishGoodsDels [],
			HttpSession session) {
		wishGoodsDelsService.execute(wishGoodsDels, session);
		return "redirect:wishList";
	}
	@GetMapping("wishDel")
	public String wishDel(@RequestParam("goodsNum")String goodsNum,
			HttpSession session) {
		wishDelService.execute(goodsNum, session);
		return "redirect:wishList";
	}
}
