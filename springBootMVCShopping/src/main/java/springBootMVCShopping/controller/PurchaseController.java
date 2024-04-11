package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.service.purchase.GoodsBuyService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	GoodsBuyService goodsBuyService;
	@PostMapping(value = "goodsBuy")
	public String goodsBuy(String[] nums ,HttpSession session,Model model) {
		goodsBuyService.execute(nums, session, model);
		return "thymeleaf/purchase/goodsOrder";
	}
}
