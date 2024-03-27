package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.StartEndPageDTO;

@Mapper
public interface GoodsMapper {
	public int goodsInsert(GoodsDTO dto);
	public List<GoodsDTO> allSelect(StartEndPageDTO sepDTO);
	public int goodsCount(String searchWord);
	//배열로 전달 된값을 마이바티스에서 사용하려면 @Param을 사용합니다
	public int productsDelete(@Param("products") String products[]);
	public GoodsDTO selectOne(String goodsNum);
	public int goodsUpdate(GoodsDTO dto);
	public int goodsDelete(String goodsNum);
	public int visitCount(String goodsNum);
	public List<GoodsDTO> wishGoodsList(String memberNum);
}
