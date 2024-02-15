package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardDetailService {
	public void execute(HttpServletRequest req) {
		String num = req.getParameter("num");
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.boardSelectOne(num);
		req.setAttribute("dto", dto); 
	}
}
