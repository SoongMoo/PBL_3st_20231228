package java_20240123_polymorphism;

public class AnimalTest1 {

	public static void main(String[] args) {
		Animal animal = new  Human(); // 다향성 : 상속이되어야 가능
		animal.move();
		animal = new Tiger();
		animal.move();
		animal = new Eagle();
		animal.move();
	}

}
