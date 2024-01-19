package java_20240119;

public class PersonEx {
	public static void main(String[] args) {
		int i; // 선언
		Person person; //  선언
		String str; // 선언
		i = 10; // 대입
		str = "이숭무"; // 대입
		str = new String("이숭무"); // 대입
		person = new Person(); // 객체 대입
		person.setName("이숭무");
		System.out.println(person.getName());
		
		person = new Person("이상범");
		System.out.println(person.getName());
		person.setName("이장범"); // 
		System.out.println(person.getName());
		
		
		
		
	}
}
