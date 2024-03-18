package board_spring_boot.service;

import org.springframework.stereotype.Service;

import board_spring_boot.model.BoardDAO;

@Service
public class BoardDeleteService {
	public void execute(String boardNum) {
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(boardNum);
	}
}