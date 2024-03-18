package board_spring_boot.service;

import org.springframework.stereotype.Service;

import board_spring_boot.command.BoardCommand;
import board_spring_boot.model.BoardDAO;
import board_spring_boot.model.BoardDTO;

@Service
public class BoardUpdateSrvice {
	public void execute(BoardCommand boardCommand) {
		Integer boardNum = boardCommand.getBoardNum();
		String boardWriter = boardCommand.getBoardWriter();
		String boardSubject = boardCommand.getBoardSubject();
		String boardContent = boardCommand.getBoardContent();
		// boardCommand가 받아온 값은 dto에게 저장
		BoardDTO dto = new BoardDTO();
		dto.setBoardNum(boardNum);
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		//dto를 dao에게 전달 
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(dto);
	}
}
