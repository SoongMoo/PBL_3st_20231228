package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.service.purchase.PurchaseListService;
import springBootMVCShopping.service.purchase.PurchaseStatusService;

@Controller
@RequestMapping("purchase")
public class EmpPurchaseController {
	@Autowired
	PurchaseListService purchaseListService;
	@Autowired
	PurchaseStatusService purchaseStatusService;
	@GetMapping("purchaseList")
	public String purchaseList(Model model) {
		purchaseListService.execute(model);
		return "thymeleaf/purchase/purchaseList";
	}
	@GetMapping("purchaseStatus")
	public String purchaseStatus(String purchaseNum) {
		purchaseStatusService.execute(purchaseNum);
		return "redirect:purchaseList";
	}
}
