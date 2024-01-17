package java_20240117_1;

public class PersonEx01 {
	public static void main(String[] args) {
		Person person = new Person(); // 객체
		person.addr = "서울";
		person.age = 30;
		person.gender = 'M';
		person.height = 173.5;
		person.name = "이숭무";
		person.phone = "010";
		
		Person person1 = new Person(); // 객체
		person1.addr = "보령";
		person1.age = 40;
		person1.gender = 'F';
		person1.height = 175.5;
		person1.name = "오연의";
		person1.phone = "043";

		System.out.println(person1.name);
		System.out.println(person1.addr);
		System.out.println(person1.gender);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		person.print();
		person1.print();
		
	}
}






