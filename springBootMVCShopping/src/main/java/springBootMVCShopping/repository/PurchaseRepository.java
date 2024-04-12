package springBootMVCShopping.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	
	
	
	
	
}
