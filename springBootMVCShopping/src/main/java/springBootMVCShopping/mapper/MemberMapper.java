package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberSelectList(StartEndPageDTO sepDTO);
	public MemberDTO memberSelectOne(String memberNum);
	public void memberUpdate(MemberDTO dto);
	public void memberDelete(String memberNum);
	public Integer memberCount();
	public void memberJoinInsert(MemberDTO dto);
}
