package board_spring.service;

import javax.servlet.http.HttpServletRequest;

import board_spring.command.BoardCommand;
import board_spring.model.BoardDAO;
import board_spring.model.BoardDTO;

public class BoardWriteService {
	public void execute(BoardCommand boardCommand ) {
		String boardWriter = boardCommand.getBoardWriter();
		String boardSubject = boardCommand.getBoardSubject();
		String boardContent = boardCommand.getBoardContent();
		// request가 받아온 값은 dto에게 저장
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		//dto를 dao에게 전달
		BoardDAO dao = new BoardDAO();
		dao.boardInsert(dto);
	}
}
