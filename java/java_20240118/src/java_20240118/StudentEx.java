package java_20240118;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentId = 123;
		s1.studentName = "이숭무";
		Student s2 = new Student(345, "이상범");
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
		Student s3 = new Student(567, "이장범", 50);
		System.out.println(s3.studentId);
		System.out.println(s3.studentName);
		Student s4 = new Student(123, 50, 50, "박준현");
		Student s5 = new Student(698, "오연의", 50, 50);
	}

}
