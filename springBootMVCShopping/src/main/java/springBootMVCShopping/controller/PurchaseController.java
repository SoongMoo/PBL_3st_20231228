package springBootMVCShopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.service.IniPayReqService;
import springBootMVCShopping.service.purchase.GoodsBuyService;
import springBootMVCShopping.service.purchase.GoodsOrderService;
import springBootMVCShopping.service.purchase.IniPayReturnService;
import springBootMVCShopping.service.purchase.OrderProcessListService;
import springBootMVCShopping.service.purchase.PaymentDeleteService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	GoodsBuyService goodsBuyService;
	@Autowired
	GoodsOrderService goodsOrderService;
	@Autowired
	IniPayReqService iniPayReqService;
	@Autowired
	OrderProcessListService orderProcessListService;
	@Autowired
	IniPayReturnService iniPayReturnService;
	@Autowired
	PaymentDeleteService paymentDeleteService;
	
	@PostMapping(value = "goodsBuy")
	public String goodsBuy(String[] nums ,HttpSession session,Model model) {
		goodsBuyService.execute(nums, session, model);
		return "thymeleaf/purchase/goodsOrder";
	}
	@PostMapping("goodsOrder")
	public String goodsOrder(PurchaseCommand purchaseCommand,HttpSession session
			, Model model) throws Exception {
		String purchaseNum = goodsOrderService.execute(purchaseCommand, session);
		/*
		iniPayReqService.execute(purchaseNum, model, session);
		return "thymeleaf/purchase/payment";
		*/
		return "redirect:paymentOk?purchaseNum="+purchaseNum;
	}
	@GetMapping("paymentOk")
	public String paymentOk(String purchaseNum, Model model
			,HttpSession session) throws Exception{
		iniPayReqService.execute(purchaseNum, model, session);
		return "thymeleaf/purchase/payment";
	}
	@GetMapping("orderList")
	public String orderList(HttpSession session, Model model) {
		orderProcessListService.execute(session, model);
		return "thymeleaf/purchase/orderList";
	}
	@RequestMapping("INIstdpay_pc_return")
	public String payReturn(HttpServletRequest request) {
		iniPayReturnService.execute(request);
		return "thymeleaf/purchase/buyfinished";
	}
	@RequestMapping("paymentDel")
	public String paymentDel(String purchaseNum) {
		paymentDeleteService.execute(purchaseNum);
		return "redirect:orderList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
