package springBootMVCShopping.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

import springBootMVCShopping.domain.GoodsStockDTO;
import springBootMVCShopping.service.goods.GoodsDetailViewService;

@Controller
@RequestMapping("corner")
public class CornerController {
	@Autowired
	GoodsDetailViewService goodsDetailViewService;
	@GetMapping("detailView/{goodsNum}")
	public String goodsInfo(@PathVariable("goodsNum") String goodsNum
			,Model model , HttpSession session) {
		goodsDetailViewService.execute(goodsNum, model, session);
		return "thymeleaf/corner/detailView";
	}
	@RequestMapping("/goodsDescript")
	public void goodsDescript(@RequestBody Map<String, String> map
			,HttpServletResponse response,Model model, HttpSession session) {
		System.out.println(map.get("goodsNum"));
		GoodsStockDTO dto = goodsDetailViewService.execute(
				map.get("goodsNum"),model,session);
		ObjectMapper mapper = new ObjectMapper();
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().print(mapper.writeValueAsString(dto));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
