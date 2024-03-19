package board_spring_boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board_spring_boot.domain.BoardDTO;

@Mapper
public interface BoardMapper {
	public void boardInsert(BoardDTO dto);
	public List<BoardDTO> boardAllSelect();
	public BoardDTO boardSelectOne(String boardNum);
	public void boardUpdate(BoardDTO dto);
	public void boardDelete(String boardNum);
}
