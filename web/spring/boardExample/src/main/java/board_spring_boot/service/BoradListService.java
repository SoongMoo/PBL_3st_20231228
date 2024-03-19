package board_spring_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import board_spring_boot.domain.BoardDTO;
import board_spring_boot.mapper.BoardMapper;

@Service
public class BoradListService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(Model model) {
		List<BoardDTO> list = boardMapper.boardAllSelect();
		model.addAttribute("dtos", list);
	}
}
