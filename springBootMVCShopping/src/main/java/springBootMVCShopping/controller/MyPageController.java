package springBootMVCShopping.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.myPage.MemberAccountService;
import springBootMVCShopping.service.myPage.MemberInfoService;
import springBootMVCShopping.service.myPage.MemberInfoUpdateService;

@Controller
@RequestMapping("myPage")
public class MyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberAccountService memberAccountService;
	@Autowired
	MemberInfoUpdateService memberInfoUpdateService;
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
	@GetMapping("memberUpdate")
	public @ResponseBody Map<String, Object> memberUpdate(HttpSession session
			,Model model) {
		Map<String, Object> map = memberAccountService.execute(session, model);
		return map;
		//return "thymeleaf/myPage/myModify";
	}
	@RequestMapping("userRegist")
	@ResponseBody
	public Map<String, Object> userRegist(MemberCommand memberCommand, 
			HttpSession session) {
		System.out.println("userRegist");
		Map<String, Object> map = memberInfoUpdateService.execute(memberCommand, session);
		return map;
	}
	
	
	
	
	
	
	
}
