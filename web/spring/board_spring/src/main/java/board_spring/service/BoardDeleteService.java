package board_spring.service;

import javax.servlet.http.HttpServletRequest;

import board_spring.model.BoardDAO;

public class BoardDeleteService {
	public void execute(String boardNum) {
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(boardNum);
	}
}