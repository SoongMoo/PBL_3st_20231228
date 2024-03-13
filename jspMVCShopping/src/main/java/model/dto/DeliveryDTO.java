package model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class DeliveryDTO {
	String deliveryNum;
	String purchaseNum;
	Date deliveryDate;
	String deliveryState;
}
