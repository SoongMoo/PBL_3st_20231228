package board_spring.service;

import org.springframework.ui.Model;

import board_spring.model.BoardDAO;
import board_spring.model.BoardDTO;

public class BoardDetailService {
	public void execute(Model model, String boardNum) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.boardSelectOne(boardNum);
		model.addAttribute("dto", dto);
	}
}
