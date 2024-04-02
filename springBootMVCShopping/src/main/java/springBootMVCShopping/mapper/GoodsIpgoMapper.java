package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.GoodsIpgoDTO;
import springBootMVCShopping.domain.GoodsIpgoGoodsNameDTO;

@Mapper
//@Repository(value = "springBootMVCShopping.mapper.GoodsIpgoMapper")
public interface GoodsIpgoMapper {
	public int goodsIpgoInsert(GoodsIpgoDTO dto);
	public List<GoodsIpgoDTO> goodsIpgoSelectList();
	public GoodsIpgoGoodsNameDTO IpgoGoodsSelectOne(
			@Param(value = "ipgoNum") String ipgoNum,
			@Param(value = "goodsNum" ) String goodsNum);
	public void goodsIpgoUpdate(GoodsIpgoDTO dto);
	public void ipgoGoodsNumDelete(	
			@Param(value = "ipgoNumNgoodsNum") String ipgoNumNgoodsNum []);
}
