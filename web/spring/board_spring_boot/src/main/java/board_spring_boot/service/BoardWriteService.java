package board_spring_boot.service;

import org.springframework.stereotype.Service;

import board_spring_boot.command.BoardCommand;
import board_spring_boot.model.BoardDAO;
import board_spring_boot.model.BoardDTO;

@Service
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
