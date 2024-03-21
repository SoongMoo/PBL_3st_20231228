package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootMVCShopping.service.EmailCheckService;

@RestController
public class CheckRestController {
	@Autowired
	EmailCheckService emailCheckService;
	@PostMapping("/checkRest/userEmailCheck")
	public String userEmailCheck(
			@RequestParam(value="userEmail") String userEmail
			) {
		String resultEmail = emailCheckService.execute(userEmail);
		if(resultEmail == null) {
			return "0";
		}else {
			return "1";
		}
	}
}
