package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;

public class BoardDeleteService {
	public void execute(HttpServletRequest req) {
		String num = req.getParameter("num");
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(num);
	}
}
