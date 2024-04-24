package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springBootMVCShopping.service.EmailCheckService;
import springBootMVCShopping.service.FileDelService;
import springBootMVCShopping.service.UserEmailCheckService;

@RestController // spring boot
public class CheckRestController implements CheckRestControllerImpl {
	@Autowired
	EmailCheckService emailCheckService;
	@Autowired
	FileDelService fileDelService;
	
	@PostMapping("/checkRest/userEmailCheck")
	@Override
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
	@Override
	public int fileDel(
			@RequestParam("orgFile") String orgFile,
			@RequestParam("storeFile") String storeFile,
			HttpSession session) {
		return fileDelService.execute(orgFile, storeFile, session);
	}
	@Autowired
	UserEmailCheckService userEmailCheckService;
	
	@RequestMapping("userConfirm")
	@Override
	public String userConfirm(String chk) {
		int i = userEmailCheckService.execute(chk); 
		if(i > 0) {
			return "인증되었습니다.";
		}
		return "이미 인증되었습니다. ";		
	}
}










