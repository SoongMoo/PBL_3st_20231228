package java_20240119_2;

public class Person {
	String name;
	int money;
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeGoods(Inventory inventory) {
		inventory.take(1000);
		money -= 1000;
	}
	public void takeGoods1(Inventory inventory) { // 객체 전달
		inventory.take(2000);
		money -= 2000;
	}
	public void showInfo() {
		System.out.println(name + "님의 잔액은 " + money + "입니다. ");
	}
}
