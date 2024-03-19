package board_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board_spring_boot.mapper.BoardMapper;

@Service
public class BoardDeleteService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(String boardNum) {
		boardMapper.boardDelete(boardNum);
	}
}
