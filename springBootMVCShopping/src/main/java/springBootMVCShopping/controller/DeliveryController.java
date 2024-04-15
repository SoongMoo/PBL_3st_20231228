package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.service.delivery.DeliveryInfoService;
import springBootMVCShopping.service.delivery.DeliveryInsertService;
import springBootMVCShopping.service.delivery.DeliveryUpdateService;

@Controller
@RequestMapping("delivery")
public class DeliveryController {
	@Autowired
	DeliveryInsertService deliveryInsertService;
	@Autowired
	DeliveryInfoService deliveryInfoService;
	@GetMapping("deliveryRegist")
	public String deliveryState(@ModelAttribute("purchaseNum") String purchaseNum
			,Model model) {
		deliveryInfoService.execute(purchaseNum, model);
		return "thymeleaf/delivery/deliveryRegist"; 
	}
	@PostMapping("deliveryRegist")
	public String deliveryRegist(String purchaseNum, String deliveryNum) {
		deliveryInsertService.execute(purchaseNum, deliveryNum);
		return "redirect:/purchase/purchaseList";
	}
	@Autowired
	DeliveryUpdateService deliveryUpdateService;
	@GetMapping("deliveryUpdate")
	public String deliveryUpdate(String purchaseNum) {
		deliveryUpdateService.execute(purchaseNum);
		return "redirect:/purchase/purchaseList";
	}
}
