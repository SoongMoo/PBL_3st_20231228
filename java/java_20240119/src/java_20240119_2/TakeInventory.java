package java_20240119_2;

public class TakeInventory {
	public static void main(String [] args) {
		Inventory inventory1 = new Inventory("청바지", 100, 0);
		Inventory inventory2 = new Inventory("냉장고", 10, 0);
		
		Person ps1 = new Person("이숭무", 5000);
		ps1.takeGoods(inventory1); // 1000
		ps1.takeGoods1(inventory2); // 2000
		
		Person ps2 = new Person("이장범", 6000);
		ps2.takeGoods1(inventory2);
		ps2.takeGoods1(inventory2);
		
		inventory1.showInfo();
		inventory2.showInfo();
		ps1.showInfo();
		ps2.showInfo();
	}
}
