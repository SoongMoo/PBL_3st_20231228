package springBootMVCShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatController {
	@RequestMapping(value = "/chatting", method = RequestMethod.GET)
	public String home() {
		return "thymeleaf/chatting/chat";
	}
}
