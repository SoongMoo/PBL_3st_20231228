package java_20240119_static_method;

public class StudentTest {
	public static void main(String[] args) {
		Student std = new Student();
		std.setStudentId(Student.getSerialNum());
		System.out.println(std.getStudentId());
		
		Student std1 = new Student();
		std1.setStudentId(Student.getSerialNum());
		System.out.println(std1.getStudentId());
	}
}
