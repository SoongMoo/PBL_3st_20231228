package java_20240123_polymorphism;

public class AnimalTest1 {

	public static void main(String[] args) {
		Animal animal = new  Human(); // 다향성 : 상속이되어야 가능
		animal.move();
		// animal.readBook();
		Human human = (Human)animal; // 강제형변환 :  다운캐스팅
		human.readBook();
		animal = new Tiger();
		Tiger tiger = (Tiger)animal; // 타운캐스팅
		tiger.hunting();
		animal.move();
		animal = new Eagle();
		animal.move();
	}

}
