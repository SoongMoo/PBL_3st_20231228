package springBootMVCShopping.command;

import lombok.Data;

@Data
public class PurchaseCommand {
	Integer totalPaymentPrice;
	String goodsNums;
	String purchaseName;
	String deliveryName;
	String deliveryAddr;
	String deliveryAddrDetail;
	String deliveryPost;
	String deliveryPhone;
	String message;
}
