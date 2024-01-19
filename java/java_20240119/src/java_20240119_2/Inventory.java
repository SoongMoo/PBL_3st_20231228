package java_20240119_2;

public class Inventory {
	String goodsName;
	int inventoryCount;
	int totalPrice;
	public Inventory(String goodsName, int inventoryCount, int totalPrice) {
		this.goodsName = goodsName;
		this.inventoryCount = inventoryCount;
		this.totalPrice = totalPrice;
	}
	public void take(int goodsPrice) {
		totalPrice += goodsPrice;
		inventoryCount -= 1;
	}
	public void showInfo() {
		System.out.println(goodsName +"의 재고는 " +
						   inventoryCount + "이고 수익금은 " + 
						   totalPrice + "입니다. ");
	}
}
