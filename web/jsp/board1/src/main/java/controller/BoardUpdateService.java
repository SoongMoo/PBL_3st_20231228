package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardUpdateService {
	public void execute(HttpServletRequest req) {
		try {
			req.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String boardNum = req.getParameter("boardNum");
		String boardWriter = req.getParameter("boardWriter");
		String boardSubject = req.getParameter("boardSubject");
		String boardContent = req.getParameter("boardContent");
		
		System.out.println(boardContent);
		
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardNum(Integer.parseInt(boardNum));
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(dto);
		
	}
}
