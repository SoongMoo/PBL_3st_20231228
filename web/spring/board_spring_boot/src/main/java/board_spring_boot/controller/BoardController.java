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
import board_spring_boot.service.BoardListService;
import board_spring_boot.service.BoardUpdateSrvice;
import board_spring_boot.service.BoardWriteService;


@Controller
public class BoardController {
	@Autowired
	BoardListService boardListService;
	@Autowired
	BoardDetailService  boardDetailService;
	@RequestMapping("boardList")
	public String list(Model model) {
		boardListService.execute(model);
		return "boardList";
	}
	@RequestMapping(value="boardWrite", method = RequestMethod.GET)
	public String writer() {
		return "boardForm";
	}
	@Autowired
	BoardWriteService boardWriteService;
	@RequestMapping(value="boardWrite", method = RequestMethod.POST)
	public String boardWrite(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	@RequestMapping("boardDetail") //POST/GET
	public String detail(@RequestParam("num") String boardNum,
			Model model) {
		boardDetailService.execute(model, boardNum);
		return "boardInfo";
	}
	@GetMapping("boardUpdate")
	public String boardUpdate(@RequestParam("num") String boardNum,
			Model model) {
		boardDetailService.execute(model, boardNum);
		return "boardModify";
	}
	@Autowired
	BoardUpdateSrvice boardUpdateSrvice;
	@PostMapping("boardUpdate")
	public String boardModify(BoardCommand boardCommand) {
		boardUpdateSrvice.execute(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getBoardNum();
	}
	@Autowired
	BoardDeleteService boardDeleteService;
	@RequestMapping(value = "boardDelete", method = RequestMethod.GET)
	public String boardDel(@RequestParam("num") String boardNum) {
		boardDeleteService.execute(boardNum);
		return "redirect:boardList";
	}	
}