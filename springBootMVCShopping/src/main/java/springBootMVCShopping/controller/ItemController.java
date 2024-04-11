package springBootMVCShopping.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import springBootMVCShopping.service.item.CartListService;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	CartListService cartListService;
	@GetMapping("cartList")
	public String cartList(Model model, HttpSession session) {
		cartListService.execute(model, session);
		return "thymeleaf/corner/cartList";
	}
	@GetMapping("cartQtyDown")
	public void cartQtyDown(String goodsNum, HttpSession session
			,HttpServletResponse response ) 
					/*throws JsonProcessingException, IOException*/ {
		/*
		ObjectMapper mapper = new ObjectMapper();
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(mapper.writeValueAsString(null));
		*/
	}
	
}
