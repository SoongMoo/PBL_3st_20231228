package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("purchaseListGoods")
public class PurchaseListGoodsDTO {
	PurchaseListDTO purchaseList; // 1
	GoodsDTO goods;   // 1
}
