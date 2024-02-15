package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardWriteService {
	public void execute(HttpServletRequest req) {
		String boardWriter = req.getParameter("boardWriter");
		String boardSubject = req.getParameter("boardSubject");
		String boardContent = req.getParameter("boardContent");
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		BoardDAO dao = new BoardDAO();
		dao.boardInsert(dto);	
	}
}
