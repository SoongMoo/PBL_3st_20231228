package board_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board_spring_boot.command.BoardCommand;
import board_spring_boot.domain.BoardDTO;
import board_spring_boot.mapper.BoardMapper;

@Service
public class BoardModifyService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(BoardCommand boardCommand ) {
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardCommand.getBoardContent());
		dto.setBoardNum(boardCommand.getBoardNum());
		dto.setBoardSubject(boardCommand.getBoardSubject());
		dto.setBoardWriter(boardCommand.getBoardWriter());
		boardMapper.boardUpdate(dto);
	}
}