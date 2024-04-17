package springBootMVCShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springBootMVCShopping.command.CartCommand;
import springBootMVCShopping.service.item.CartInsertService;
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
	@Autowired
	CartInsertService cartInsertService;
	@GetMapping("buyItem")
	public String buyItem(CartCommand cartCommand, HttpSession session,
			HttpServletResponse response ) {
		String result = cartInsertService.execute(cartCommand, session);
		if(result == "000") {
			return "redirect:/";
		}else if(result == "900"){
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out;
			try {
				out = response.getWriter();
				String str = "<script>"
						+ "alert('관리자는 구매할 수 없습니다.');"
						+ "location.href='/corner/detailView/"+cartCommand.getGoodsNum()+"';" //장바구니에 안들어 갔으면 상품페이지
						+ "</script>";
				out.print(str);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "redirect:/purchase/goodsBuy?nums="+cartCommand.getGoodsNum();
	}
}
