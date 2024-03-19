package board_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import board_spring_boot.command.BoardCommand;
import board_spring_boot.service.BoardWriteService;
import board_spring_boot.service.BoradListService;

@Controller
public class BoardContoller {
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoradListService boradListService;
	@RequestMapping("boardList") // post/get
	public String 	boardList(Model model) {
		boradListService.execute(model);
		return "thymeleaf/board/boardList";
	}
	@RequestMapping(value="boardWrite", method = RequestMethod.GET )
	public String boardWrite() {
		return "thymeleaf/board/boardForm";
	}
	@RequestMapping(value="boardWrite" , method = RequestMethod.POST)
	public String boardWrite(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
}
