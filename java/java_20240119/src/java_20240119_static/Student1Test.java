package java_20240119_static;

public class Student1Test {
	public static void main(String[] args) {
		Student1 std = new Student1();
		std.setStudentId(Student1.serialNum++); // serialNum = 1000
		std.setStudentName("이숭무");
		
		Student1 std1 = new Student1();
		std1.setStudentId(Student1.serialNum++); // 1000
		std1.setStudentName("이상범");
		
		System.out.println(std.getStudentId());
		System.out.println(std1.getStudentId());
	}
}