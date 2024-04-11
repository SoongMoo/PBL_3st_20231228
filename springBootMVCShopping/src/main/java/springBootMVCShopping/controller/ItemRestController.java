package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootMVCShopping.command.CartCommand;
import springBootMVCShopping.service.item.CartInsertService;
import springBootMVCShopping.service.item.GoodsCartDelsService;
import springBootMVCShopping.service.item.GoodsWishService;

@RestController
@RequestMapping("item")
public class ItemRestController {
	@Autowired
	GoodsWishService goodsWishService;
	@Autowired
	CartInsertService cartInsertService;
	@Autowired
	GoodsCartDelsService goodsCartDelsService;
	
	@PostMapping("goodsWishAdd")
	public String wishAdd(String goodsNum,HttpSession session) {
		return goodsWishService.execute(goodsNum, session);
	}
	@PostMapping("cartAdd")
	public String cartAdd(@RequestBody CartCommand cartCommand
			, HttpSession session) {
		System.out.println(cartCommand.getGoodsNum());
		return cartInsertService.execute(cartCommand, session);
	}
	@PostMapping(value = "cartDels") 
	public String cartdel(@RequestBody String goodsNums[], HttpSession session) {
		return goodsCartDelsService.execute(goodsNums, session);
	}
}
