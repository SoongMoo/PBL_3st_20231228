package board_spring_boot.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board_spring_boot.model.BoardDAO;
import board_spring_boot.model.BoardDTO;

@Service
public class BoardDetailService {
	public void execute(Model model, String boardNum) {
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.boardSelectOne(boardNum);
		model.addAttribute("dto", dto);
	}
}
