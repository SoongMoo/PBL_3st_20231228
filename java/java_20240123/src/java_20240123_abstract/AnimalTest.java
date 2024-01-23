package java_20240123_abstract;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		human.move();
		Animal animal = new Human(); // 추상클래스는 상속해서 사용한다.
		animal.move();
		// Animal a = new Animal(); 추상클래스는 객체생성을 하지 못한다.
	}

}
