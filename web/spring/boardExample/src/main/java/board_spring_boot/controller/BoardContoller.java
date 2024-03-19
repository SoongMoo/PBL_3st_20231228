package board_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import board_spring_boot.command.BoardCommand;
import board_spring_boot.service.BoardDeleteService;
import board_spring_boot.service.BoardDetailService;
import board_spring_boot.service.BoardModifyService;
import board_spring_boot.service.BoardWriteService;
import board_spring_boot.service.BoradListService;

@Controller
public class BoardContoller {
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoradListService boradListService;
	@Autowired
	BoardDetailService boardDetailService;
	@Autowired
	BoardModifyService boardModifyService;
	@Autowired
	BoardDeleteService boardDeleteService;
	@RequestMapping("boardList") // post/get
	public String 	boardList(Model model) {
		boradListService.execute(model);
		//return "thymeleaf/board/boardList";
		return "boardList";
	}
	@RequestMapping(value="boardWrite", method = RequestMethod.GET )
	public String boardWrite() {
		//return "thymeleaf/board/boardForm";
		return "boardForm";
	}
	@RequestMapping(value="boardWrite" , method = RequestMethod.POST)
	public String boardWrite(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	@GetMapping("boardDetail")
	public String boardDetail(@RequestParam("num") String boardNum,
			Model model) {
		boardDetailService.execute(boardNum, model);
		//return "thymeleaf/board/boardInfo";
		return "boardInfo";
	}
	@GetMapping("boardUpdate")
	public String boardUpdate(@RequestParam("num") String boardNum,
			Model model) {
		boardDetailService.execute(boardNum, model);
		return "thymeleaf/board/boardModify";
	}
	@PostMapping("boardUpdate")
	public String boardUpdate(BoardCommand boardCommand) {
		boardModifyService.execute(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getBoardNum();
	}
	@GetMapping("boardDelete")
	public String boardDelete(@RequestParam("num") String boardNum) {
		boardDeleteService.execute(boardNum);
		return "redirect:boardList";
	}
}
