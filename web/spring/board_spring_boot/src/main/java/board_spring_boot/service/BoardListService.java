package board_spring_boot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board_spring_boot.model.BoardDAO;
import board_spring_boot.model.BoardDTO;

@Service
public class BoardListService {
	public void execute(Model model) {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> list = dao.boardAllSelect();
		model.addAttribute("dtos", list);
	}
}
