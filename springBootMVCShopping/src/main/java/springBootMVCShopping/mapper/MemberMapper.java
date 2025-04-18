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
	public MemberDTO memberSelectOne(String memberNumOrId);
	public void memberUpdate(MemberDTO dto);
	public int memberDelete(String memberNum);
	public Integer memberCount();
	public int memberJoinInsert(MemberDTO dto);
	public int userCkeckUpdate(String chk);
	public void memberPwUpdate(@Param("memberPw") String memberPw, 
							   @Param("memberId") String memberId);
}