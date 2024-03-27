package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootMVCShopping.service.EmailCheckService;
import springBootMVCShopping.service.FileDelService;

@RestController
public class CheckRestController {
	@Autowired
	EmailCheckService emailCheckService;
	@Autowired
	FileDelService fileDelService;
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
	@PostMapping("/goods/fileDel")
	public int fileDel(
			@RequestParam("orgFile") String orgFile,
			@RequestParam("storeFile") String storeFile,
			HttpSession session) {
		return fileDelService.execute(orgFile, storeFile, session);
	}
}










