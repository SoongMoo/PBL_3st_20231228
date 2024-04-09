package springBootMVCShopping.domain;

import java.util.Date;

import lombok.Data;

@Data
public class WishDTO {
	String memberNum;
	String goodsNum;
	Date wishDate;
}
