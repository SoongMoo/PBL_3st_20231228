package board_spring.service;

import java.util.List;

import org.springframework.ui.Model;

import board_spring.model.BoardDAO;
import board_spring.model.BoardDTO;

public class BoardListService {
	public void execute(Model model) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.boardAllSelect();
		model.addAttribute("dtos", list);
	}
}
