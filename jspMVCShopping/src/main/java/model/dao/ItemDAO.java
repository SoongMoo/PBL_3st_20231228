package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dto.WishListDTO;

public class ItemDAO extends DataBaseInfo {
	public void wishItem(String goodsNum, String memberNum) {
		con = getConnection();
		sql = " merge into wish w "
			+ " using (select goods_num from goods where goods_num = ?) g "
			+ " on  (w.goods_num = g.goods_num  and member_num =? ) "
			+ " When MATCHED THEN "
			+ " 	update set WISH_DATE = sysdate"
			+ " 	delete where  member_num = ? and goods_num = ? "
			+ " When not MATCHED THEN "
			+ " 	insert (MEMBER_NUM,GOODS_NUM,WISH_DATE  ) "
			+ " 	values (?, ?, sysdate)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			pstmt.setString(2, memberNum);
			pstmt.setString(3, memberNum);
			pstmt.setString(4, goodsNum);
			pstmt.setString(5, memberNum);
			pstmt.setString(6, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 병합되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	public int wishSelectOne(String memberNum,String goodsNum){
		con = getConnection();
		sql = " select * from wish where member_num = ? and goods_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return 0;
	}
	public  List<WishListDTO> wishSelectList(String memberNum){
		List<WishListDTO> list = new ArrayList<WishListDTO>();
		con = getConnection();
		sql = " select g.goods_num, goods_Main_Store, goods_name,goods_price "
			+ "       ,wish_date "
			+ " from goods g join wish w "
			+ " on g.goods_num = w.goods_num "
			+ " where member_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				WishListDTO dto = new WishListDTO();
				dto.setGoodsMainStore(rs.getString("goods_Main_Store"));
				dto.setGoodsName(rs.getString("goods_name"));
				dto.setGoodsNum(rs.getString("goods_num"));
				dto.setGoodsPrice(rs.getInt("goods_price"));
				dto.setWishDate(rs.getDate("wish_date"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return list;
	}
	public void wishGoodsDelete(String memberNum,String goodsNum) {
		con = getConnection();
		sql = " delete from wish where goods_num =? and member_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			pstmt.setString(2, memberNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
}
