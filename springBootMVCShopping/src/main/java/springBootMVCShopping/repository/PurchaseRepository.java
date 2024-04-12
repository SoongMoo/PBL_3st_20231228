package springBootMVCShopping.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.domain.PurchaseDTO;
import springBootMVCShopping.domain.PurchaseListDTO;

@Repository
public class PurchaseRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "PurchaseRepositorySql";
	String statement;
	public String selectNum() {
		statement = namespace + ".numSelect";
		return sqlSession.selectOne(statement);
	}
	public int purchaseInsert(PurchaseDTO dto) {
		statement = namespace + ".purchaseInsert";
		return sqlSession.insert(statement,dto);
	}   
	public int purchaseListInsert(PurchaseListDTO dto) {
		statement = namespace + ".purchaseListInsert";
		return sqlSession.insert(statement,dto);
	}
	public PurchaseDTO purchaseSelect(String purchaseNum) {
		statement = namespace + ".purchaseSelect";
		return sqlSession.selectOne(statement,purchaseNum);
	}
	public List<OrderListDTO> orderList(String memberNum){
		statement = namespace + ".orderList";
		return sqlSession.selectList(statement, memberNum);
	}
}
