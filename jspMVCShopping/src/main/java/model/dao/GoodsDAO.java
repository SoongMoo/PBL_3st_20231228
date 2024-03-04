package model.dao;

import java.sql.SQLException;

import model.dto.GoodsDTO;

public class GoodsDAO extends DataBaseInfo {
	public void goodsInsert(GoodsDTO dto) {
		con = getConnection();
		sql = " insert into goods (goods_Num, goods_name, goods_price"
			+ "                   ,goods_content,delivery_cost,emp_num"
			+ "					  ,goods_regist, visit_count) "
			+ " values(?,?,?,?,?,?,sysdate,0)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getGoodsNum());
			pstmt.setString(2, dto.getGoodsName());
			pstmt.setInt(3, dto.getGoodsPrice());
			pstmt.setString(4, dto.getGoodsContent());
			pstmt.setInt(5, dto.getDeliveryCost());
			pstmt.setString(6, dto.getEmpNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {close();}
	}
	public String goodsAutoNum() {
		String goodsNum = null;
		con = getConnection();
		sql = " select concat('hk' , nvl(max(substr(goods_num,3)),100000) + 1) from goods ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			goodsNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}		
		return goodsNum;
	}
}








