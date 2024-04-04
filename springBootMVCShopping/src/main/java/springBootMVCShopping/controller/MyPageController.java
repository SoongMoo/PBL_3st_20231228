package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springBootMVCShopping.service.myPage.MemberInfoService;

@Controller
@RequestMapping("myPage")
public class MyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	@GetMapping("memberMyPage")
	public String memMyPage() {
		return "thymeleaf/myPage/memberMyPage";
	}
	@PostMapping("memberMyPage")
	public ModelAndView memMyPage(HttpSession session, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		memberInfoService.execute(session, model);
		return mav;
	}
}
