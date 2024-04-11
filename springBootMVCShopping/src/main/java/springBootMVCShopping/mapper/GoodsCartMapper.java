package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.domain.GoodsCartDTO;
import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface GoodsCartMapper {
	public GoodsDTO goodsSelect(String goodsNum);
	public CartDTO cartSelect(Integer cartNum);
	public List<GoodsCartDTO> goodsCartSelectList(@Param("memberNum") String memberNum, 
			   						   @Param("goodsNums") String [] goodsNums);
}
