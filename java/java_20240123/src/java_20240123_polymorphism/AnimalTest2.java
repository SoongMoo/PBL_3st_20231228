package java_20240123_polymorphism;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal animal = new Human();
		animal.move();
		animal = new Tiger(); // 다향성
		animal.move();	
		if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else if(animal  instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		Animal a = new Animal();
	}

}
