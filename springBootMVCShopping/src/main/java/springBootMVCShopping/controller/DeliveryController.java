package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/delivery/deliveryRegist"; 
	}
	@PostMapping("deliveryRegist")
	public String deliveryRegist(String purchaseNum
			,@RequestParam(value="deliveryNum" , required = false , defaultValue = "") String deliveryNum
		    ,@RequestParam(value="deliveryCompany" , required = false , defaultValue = "") String deliveryCompany) {
		deliveryInsertService.execute(purchaseNum, deliveryNum, deliveryCompany);
		return "redirect:deliveryRegist?purchaseNum="+purchaseNum;
	}
	@Autowired
	DeliveryUpdateService deliveryUpdateService;
	@GetMapping("deliveryUpdate")
	public String deliveryUpdate(String purchaseNum) {
		deliveryUpdateService.execute(purchaseNum);
		return "redirect:/purchase/purchaseList";
	}
}
