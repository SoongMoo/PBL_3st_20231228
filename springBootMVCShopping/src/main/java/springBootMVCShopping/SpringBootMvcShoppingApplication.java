package springBootMVCShopping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.CookiesService;
import springBootMVCShopping.service.goods.MainGoodsListService;

@Controller
@SpringBootApplication
@MapperScan(value={"springBootMVCShopping.mapper"})
public class SpringBootMvcShoppingApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}
	@Autowired
	MainGoodsListService mainGoodsListService;
	@Autowired
	CookiesService cookiesService;
	@GetMapping("/")
	public String index( /*LoginCommand loginCommand */
			@ModelAttribute("loginCommand") LoginCommand loginCommand 
		   ,@RequestParam(value="page", required = false , defaultValue = "1") Integer page 
		   , Model model,HttpServletRequest request) {
		// model.addAttribute("loginCommand", new LoginCommand());
		cookiesService.execute(request, model, loginCommand);
		mainGoodsListService.execute(page, model);
		return "thymeleaf/index";
	}
	
	@PostMapping("/")
	public ModelAndView index(
			LoginCommand loginCommand
			, Model model
			,@RequestParam(value="page", required = false , defaultValue = "1") Integer page 
			) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		mainGoodsListService.execute(page, model);
		return mav;
	}
}
