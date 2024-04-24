package springBootMVCShopping.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;

public interface CheckRestControllerImpl {
	String userEmailCheck(String userEmail);
	int fileDel(	@RequestParam("orgFile") String orgFile,
			@RequestParam("storeFile") String storeFile,
			HttpSession session);
	String userConfirm(String chk);
}
