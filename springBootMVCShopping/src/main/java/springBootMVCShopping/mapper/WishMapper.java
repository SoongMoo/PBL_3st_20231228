package springBootMVCShopping.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.WishDTO;

@Mapper
@Repository(value="springBootMVCShopping.mapper.WishMapper")
public interface WishMapper {
	public void wishAddDelete(@Param("goodsNum") String goodsNum
							, @Param("memberNum") String memberNum);
	public int wishCountSelectOne(Map<String , String> map);
	
}
