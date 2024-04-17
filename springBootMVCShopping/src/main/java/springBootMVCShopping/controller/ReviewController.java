package springBootMVCShopping.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.repository.ReviewRepository;
import springBootMVCShopping.service.review.ReviewWriteService;

@Controller
@RequestMapping("review")
public class ReviewController {
	@Autowired
	ReviewWriteService reviewWriteService;
	@Autowired
	ReviewRepository reviewRepository;
	@RequestMapping(value="goodsReview" , method=RequestMethod.GET)
	public String goodsReview(
			@ModelAttribute("goodsNum") String goodsNum
		   ,@ModelAttribute("purchaseNum") String purchaseNum
		   ,Model model) {
		ReviewDTO dto = new ReviewDTO();
		dto.setGoodsNum(goodsNum);
		dto.setPurchaseNum(purchaseNum);
		String reviewContent = reviewRepository.reviewSelectOne(dto);
		model.addAttribute("reviewContent", reviewContent);
		return "thymeleaf/review/goodsReview";
	}
	@RequestMapping(value = "reviewWrite", method = RequestMethod.POST)
	public String reviewWrite(String goodsNum, String purchaseNum
			,String reviewContent, HttpSession session) {
		reviewWriteService.execute(goodsNum, reviewContent, purchaseNum, session);
		return "redirect:/purchase/orderList";
	}
	@RequestMapping("reviewList")
	public String reviewList(
			@RequestBody Map<String, String> map , Model model) {
		List<ReviewDTO> list =  reviewRepository.goodsReviewList(map.get("goodsNum"));
		model.addAttribute("list", list);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/review/reviewList";
	}
}
