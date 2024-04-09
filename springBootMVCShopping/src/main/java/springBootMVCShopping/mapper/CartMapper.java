package springBootMVCShopping.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.GoodsCartDTO;

@Repository(value="springBootMVCShopping.mapper.CartMapper")
public interface CartMapper {
	public void cartInsert(Map<String, Object> map);
	public List<GoodsCartDTO> cartSelectList(String memberNum);
}
