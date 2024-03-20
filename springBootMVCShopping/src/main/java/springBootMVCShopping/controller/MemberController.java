package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.member.MemberDeleteService;
import springBootMVCShopping.service.member.MemberDetailService;
import springBootMVCShopping.service.member.MemberInsertService;
import springBootMVCShopping.service.member.MemberListService;
import springBootMVCShopping.service.member.MemberUpdateService;

@Controller
@RequestMapping("member") //공통주소 처리
public class MemberController {
	@Autowired  
	MemberInsertService memberInsertService;
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MemberUpdateService memberUpdateService;
	@Autowired
	MemberDeleteService memberDeleteService;
	@GetMapping("memberList")
	public String memList(Model model) {
		memberListService.execute(model);
		return "thymeleaf/member/memberList";
	}
	@RequestMapping(value="memberRegist", method = RequestMethod.GET)
	public String form(MemberCommand memberCommand) {
		return "thymeleaf/member/memberForm";
	}
	@RequestMapping(value="memberRegist", method = RequestMethod.POST)
	public String form(@Validated MemberCommand memberCommand
			,BindingResult result) {
		if(result.hasErrors()) {
			return "thymeleaf/member/memberForm";
		}
		if(!memberCommand.isMemberPwEqualsMemberPwCon()) {
			result.rejectValue("memberPwCon","memberCommand.memberPwCon"
								, "비밀번호 확인이 틀렸습니다.");
			return "thymeleaf/member/memberForm";
		}
		memberInsertService.execute(memberCommand);
		return "redirect:memberList";
	}
	@GetMapping("memberDetail")
	// String memberNum = request.getParameter("memberNum")
	public String detail(@RequestParam("memberNum") String memberNum
			,Model model) {
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberInfo";
	}
	@GetMapping("memberUpdate")
	public String memberUpdate(@RequestParam("memberNum") String memberNum
			,Model model) {
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberModify";		
	}
	
	@PostMapping("memberModify")
	public String memberModify(MemberCommand memberCommand) {
		memberUpdateService.execute(memberCommand);
		return "redirect:memberDetail?memberNum="+memberCommand.getMemberNum();
	}
	@GetMapping("memberDelete")
	public String memberDelete(@RequestParam("memberNum") String memberNum) {
		memberDeleteService.execute(memberNum);
		return "redirect:memberList";
	}
	
	
	
	
	
	
	
	
}
