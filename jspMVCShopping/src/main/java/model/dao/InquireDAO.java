package model.dao;

import java.sql.SQLException;

import model.dto.InquireDTO;

public class InquireDAO extends DataBaseInfo {
	public void inquireInsert(InquireDTO dto) {
		con = getConnection();
		sql = " insert into goods_inquire(" 
			+ "             MEMBER_NUM,GOODS_NUM,INQUIRE_SUBJECT"
			+ "            ,INQUIRE_CONTENT,inquire_Kind,inquire_Date) " 
			+ " values( ?, ?, ?, ?, ?, sysdate)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, dto.getInquireSubject());
			pstmt.setString(4, dto.getInquireContent());
			pstmt.setString(5, dto.getInquireKind());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {close();}
	}
}
