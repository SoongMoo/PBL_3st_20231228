package springBootMVCShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("register")
public class MemberJoinController {
	@RequestMapping(value="userAgree", method = RequestMethod.GET)
	public String agree() {
		return "thymeleaf/memberJoin/agree";
	}
	@RequestMapping(value="userWrite", method = RequestMethod.POST)
	public String userWrite(boolean agree) {
		if(agree == false) {
			return "thymeleaf/memberJoin/agree";
		}
		return "thymeleaf/memberRegist/userForm";
	}
}
