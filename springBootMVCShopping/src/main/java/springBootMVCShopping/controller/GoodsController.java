package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.service.goods.GoodsAutoNumService;
import springBootMVCShopping.service.goods.GoodsDeleteService;
import springBootMVCShopping.service.goods.GoodsDetailService;
import springBootMVCShopping.service.goods.GoodsListService;
import springBootMVCShopping.service.goods.GoodsUpdateService;
import springBootMVCShopping.service.goods.GoodsWriteService;
import springBootMVCShopping.service.goods.ProductsDeleteService;

@Controller
@RequestMapping("goods")
public class GoodsController {
	@Autowired
	GoodsAutoNumService goodsAutoNumService;
	@Autowired
	GoodsListService goodsListService;
	@RequestMapping(value="goodsList" , method=RequestMethod.GET)
	public String  goodsList(
			@RequestParam(value="searchWord" , required = false) String searchWord,
			@RequestParam(value = "page" , required = false , defaultValue = "1") int page,
			@RequestParam(value="item", required = false) String item, /// ipgo
			Model model) {
		model.addAttribute("item", item);
		goodsListService.execute(searchWord, model, page);
		return "thymeleaf/goods/goodsList";
	}
	@GetMapping("goodsForm")
	public String goodsForm() {
		return "thymeleaf/goods/goodsWrite";
	}
	@GetMapping("goodsWrite")
	public String goodsWrite(Model model) {
		goodsAutoNumService.execute(model);
		return "thymeleaf/goods/goodsForm";
	}
	@Autowired
	GoodsWriteService goodsWriteService;
	@RequestMapping(value="goodsWrite" , method=RequestMethod.POST)
	public String goodsWrite(@Validated GoodsCommand goodsCommand,BindingResult result
			,HttpSession session) {
		if(result.hasErrors()) {
			return "thymeleaf/goods/goodsForm";
		}
		if(goodsCommand.getGoodsMainStore().getOriginalFilename().isEmpty()) {
			result.rejectValue("goodsMainStore", "goodsCommand.goodsMainStore"
					, "이미지를 선택해주세요.");
			return "thymeleaf/goods/goodsForm";
		}
		goodsWriteService.execute(goodsCommand, session);
		
		//return "redirect:goodsList";
		//오류가 없는 경우 goodsForm.html을 넘겨주고 정상이면 goodsRedirect.html을 넘겨준다.
		return "thymeleaf/goods/goodsRedirect";
	}
	@Autowired
	ProductsDeleteService productsDeleteService;
	@PostMapping("productsDelete")
	public String productsDelete(//체크박스에 의해 전달 된 값을 배열로 받습니다.
			@RequestParam(value = "nums") String memDels[]) {
		productsDeleteService.execute(memDels);
		return "redirect:goodsList";
	}
	@Autowired
	GoodsDetailService goodsDetailService;
	@GetMapping("goodsDetail")
	public String goodsDetail(@RequestParam("goodsNum") String goodsNum
			,Model model,HttpSession session) {
		session.removeAttribute("fileList");
		goodsDetailService.execute(goodsNum, model);
		return "thymeleaf/goods/goodsInfo";
	}
	@GetMapping("goodsUpdate")
	public String goodsUpdate(@RequestParam("goodsNum") String goodsNum, Model model
			, HttpSession session) {
		// 삭제할 파일을 선택한 후 다시 수정페이지로 오면 삭제할 파일정보를 가진 session이 존재하여 오류의 소지가 있다.
		// 그래서 수정 페이지에 오면 삭제할 파일정보를 가진 session을 제거 하는 것이 좋다. 
		session.removeAttribute("fileList"); // 삭제할 파일 정보를 가지고 있는 session삭제
		goodsDetailService.execute(goodsNum, model);//수정을 하려면 기본 정보를 가져와야 하므로 goodsDetailService를 사용
		return "thymeleaf/goods/goodsModify";
	}
	@Autowired
	GoodsUpdateService goodsUpdateService;
	@PostMapping("goodsUpdate")
	public String goodsUpdate(@Validated GoodsCommand goodsCommand,BindingResult result,
			HttpSession session, Model model) {
		goodsUpdateService.execute(goodsCommand, session, result, model);
		if(result.hasErrors()) {
			return "thymeleaf/goods/goodsModify";
		}
		return "redirect:goodsDetail?goodsNum="+goodsCommand.getGoodsNum();
	}
	@Autowired
	GoodsDeleteService goodsDeleteService;
	@RequestMapping("goodsDel/{goodsNum}")
	public String goodsDel(@PathVariable("goodsNum") String goodsNum) {
		goodsDeleteService.execute(goodsNum);
		return "redirect:../goodsList"; //PathVariable인 경우에는 주소 앞에 .. 을 꼭해줘야 합니다.
	}
	// 먼저 진행했던 ipgo데이커로 인해 오류가 보였으나 다음에 할 내용리라 여기까지 진행 했다면 오류가 없을 것입니다.
	// 다음시간에는 상품에 그림을 등록하는 방법에 대해서 설명하겠습니다.
	// 여기서 잠깐 마이바티스에서 setter를 사용했던 것을 생성자를 이용하는 것으로 변경해 보겠습니다.
}
























