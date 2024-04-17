package springBootMVCShopping.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import springBootMVCShopping.domain.InquireDTO;

public class InquireRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "inquireMapperSql";
	String statement;
	public List<InquireDTO> inquireList(String goodsNum, Integer inquireNum ){
		InquireDTO dto = new InquireDTO();
		dto.setGoodsNum(goodsNum);
		dto.setInquireNum(inquireNum);
		statement = namespace + ".inquireList";
		return sqlSession.selectList(statement,dto);
	}
}
