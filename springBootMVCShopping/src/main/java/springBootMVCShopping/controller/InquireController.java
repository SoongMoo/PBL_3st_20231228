package springBootMVCShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.repository.InquireRepository;

@Controller
@RequestMapping("inquire")
public class InquireController {
	@Autowired
	InquireRepository inquireRepository;
	@RequestMapping("inquireList")
	public String inquireList(@ModelAttribute("goodsNum") String goodsNum,
			Integer inquireNum) {
		List<InquireDTO> list = inquireRepository.inquireList(goodsNum,inquireNum);
		return "thymeleaf/inquire/inquireList";
	}
}
