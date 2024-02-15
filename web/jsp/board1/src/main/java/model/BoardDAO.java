package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	String jdbcURL;  //  오라클 주소
	String jdbcDriver; // 오라클에 접속하기 위한 API
	Connection con; // 오라클 접속정보
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet rs;
	String sql; 
	public BoardDAO() { // default 생성자
		jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		
		/*
		--- mySql , mariadb
		jdbcDriver = "com.mysql.jdbc.Driver";
		jdbcURL = "jdbc:mysql://localhost:3306/mydb";
		-- postgreSql
		jdbcDriver = "org.postgresql.Driver";
		jdbcURL = "jdbc:postgresql://localhost:5432/mydb";
		-- mssql
		jdbcDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		jdbcURL="jdbc:sqlserver://localhost:1433;databaseName=mydb;";
		*/
	}
	public Connection getConnection() {
		Connection co = null;
		try {
		Class.forName(jdbcDriver);
		co = DriverManager.getConnection(jdbcURL,"rhee","1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return co;
	}
	public void boardDelete(String num) {
		con = getConnection();
		sql = " delete from board "
			+ " where board_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			int i = pstmt.executeUpdate();
			System.out.println(i +"개 행이(가) 삭제되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void boardUpdate(BoardDTO dto) {
		con = getConnection();
		sql = " update board "
			+ " set BOARD_WRITER = ?,"  // 1
			+ "     BOARD_SUBJECT = ?," // 2
			+ "     BOARD_CONTENT = ?"  // 3
			+ " where BOARD_NUM = ?";   // 4
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			pstmt.setInt(4, dto.getBoardNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
	}
	public BoardDTO boardSelectOne(String num) {
		BoardDTO dto = null;
		con = getConnection();
		sql = " select BOARD_NUM, BOARD_WRITER, BOARD_SUBJECT, BOARD_CONTENT "
		    + " from board "
		    + " where board_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new BoardDTO();
				dto.setBoardContent(rs.getString(4));
				dto.setBoardNum(rs.getInt(1));
				dto.setBoardSubject(rs.getString(3));
				dto.setBoardWriter(rs.getString("BOARD_WRITER"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	public List<BoardDTO> boardSelect(){
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		con = getConnection();
		sql = " select BOARD_NUM, BOARD_WRITER, BOARD_SUBJECT, BOARD_CONTENT "
			//            1            2              3             4
			+ " from board "
			+ " order by BOARD_NUM desc";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // recodeset을 가져온다
			while(rs.next()) { // cursor
				BoardDTO dto = new BoardDTO();
				dto.setBoardNum(rs.getInt("BOARD_NUM")); // 컬럼명
				dto.setBoardWriter(rs.getString(2));   // index
				dto.setBoardSubject(rs.getString("BOARD_SUBJECT"));
				dto.setBoardContent(rs.getString(4));
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	
	public void boardInsert(BoardDTO dto) {
		con = getConnection();
		String boardNum = " select nvl(max(BOARD_NUM), 0) + 1 from board ";
		sql = " insert into board(BOARD_NUM, BOARD_WRITER, BOARD_SUBJECT, BOARD_CONTENT) "
			+ " values(("+boardNum+"), ?, ?,? )";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBoardWriter());
			pstmt.setString(2, dto.getBoardSubject());
			pstmt.setString(3, dto.getBoardContent());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void close() {
		if(rs != null) try{rs.close();}catch(Exception e) {}
		if(pstmt != null) try{pstmt.close();}catch(Exception e) {}
		if(con != null) try{con.close();}catch(Exception e) {}
	}
}
