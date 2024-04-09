package springBootMVCShopping.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.ResponseBody;

import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.goods.MainGoodsListService;
import springBootMVCShopping.service.login.IdcheckService;
import springBootMVCShopping.service.login.UserLoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	IdcheckService idcheckService;
	@Autowired
	UserLoginService userLoginService;
	@Autowired
	MainGoodsListService mainGoodsListService;
	@PostMapping("userIdCheck")
	public @ResponseBody String userIdCheck( // spring
			@RequestParam(value="userId") String userId) {
		String resultId = idcheckService.execute(userId);
		if(resultId == null) {
			return "0";
		}else {	
			return "1";
		}
	}	
	@PostMapping("login")
	public String login(@Validated LoginCommand loginCommand, BindingResult result
			,@RequestParam(value="page", required = false , defaultValue = "1") Integer page 
			, Model model, HttpSession session) {
		userLoginService.execute(loginCommand, session, result);
		if(result.hasErrors()) {
			mainGoodsListService.execute(page, model);
			return "thymeleaf/index";
		}
		
		return "redirect:/";
	}
	@RequestMapping(value="logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("item.login")
	public String item() {
		return "thymeleaf/login";
	}
	@PostMapping("item.login")
	public void item(LoginCommand loginCommand,BindingResult result
			,HttpSession session, HttpServletResponse response) {
		userLoginService.execute(loginCommand, session, result);
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str = "<script language='javascript'>"
				   + " opener.location.reload();"
				   + " window.self.close();"
				   + " </script>"; 
		out.print(str);
		out.close();
	}
	
	
	
	
	
	
	
	
}
