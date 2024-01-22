package java_20240122_array;

public class StudentObjectArray {
	public static void main(String[] args) {
		Student std0 = new Student(123, "이숭무", "1");
		Student std1 = new Student(234, "이상범", "1");
		//...
		Student std99 = new Student(987, "오연의", "4");
		int i0 = 10;
		int i1 = 11;
		//...
		int i99= 99;
		int i [] = new int[100];
		i[0] = 10;
		i[1] = 11;
		//...
		i[99] = 99;
		Student std [] = new Student[100]; // 객체배열
		std[0] = new Student(123, "이숭무", "1");
		std[1] = new Student(234, "이상범", "1");
		//...
		std[99] = new Student(987, "오연의", "4");
		System.out.println(std0.getStudentName());
		System.out.println(std[0].getStudentName());
		
	}
}
