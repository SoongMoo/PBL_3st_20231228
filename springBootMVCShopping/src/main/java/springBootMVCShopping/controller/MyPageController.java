package springBootMVCShopping.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.command.UserPwCommand;
import springBootMVCShopping.service.myPage.MemberAccountService;
import springBootMVCShopping.service.myPage.MemberDropService;
import springBootMVCShopping.service.myPage.MemberInfoService;
import springBootMVCShopping.service.myPage.MemberInfoUpdateService;
import springBootMVCShopping.service.myPage.MemberPwModifyService;
import springBootMVCShopping.service.myPage.UserPasswordConfirmService;



@Controller
@RequestMapping("myPage")
public class MyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberAccountService memberAccountService;
	@Autowired
	MemberInfoUpdateService memberInfoUpdateService;
	@Autowired
	MemberPwModifyService memberPwModifyService;
	@Autowired
	UserPasswordConfirmService userPasswordConfirmService;
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
	@GetMapping("userPwModify")
	public String getMethodName() {
		return "thymeleaf/myPage/myPwCon";
	}
	@PostMapping("memberPwModify")
	public String memberPwModify(@RequestParam String  memberPw
			, HttpSession session, Model model) {
		int i = memberPwModifyService.execute(memberPw, session);
		if(i == 1)	return "thymeleaf/myPage/myNewPw";
		else {
			model.addAttribute("errPw", "비밀번호가 맞지 않습니다.");
			return "thymeleaf/myPage/myPwCon";
		}
	}
	@PostMapping("myPwUpdate") // json으로 전송된 값은 @RequestBody로 받는다.
	@ResponseBody
	public boolean myPwUpdate(@RequestBody UserPwCommand userPwCommand
			,HttpSession session) {
		return userPasswordConfirmService.execute(userPwCommand, session);
	}
	@GetMapping("userDrop")
	public String userDrop() {
		return "thymeleaf/myPage/memberDrop";
	}
	
	@Autowired
	MemberDropService memberDropService;
	@PostMapping("memberDropOk")
	public String postMethodName(@RequestParam String memberPw,HttpSession session,Model model) {
		int i = memberDropService.execute(memberPw, session);
		if(i == 1) {
			return "redirect:/login/logout";
		}else {
			model.addAttribute("errPw", "비밀번호가 틀렸습니다.");
			return "thymeleaf/myPage/memberDrop";
		}
	}
	
	
	
	
	
	
	
}