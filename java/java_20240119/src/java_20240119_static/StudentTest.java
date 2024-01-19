package java_20240119_static;

public class StudentTest {
	public static void main(String [] args) {
		Student std1 = new Student();
		int seriesNum = std1.serialNum++; // 1000
		std1.setStudentId(seriesNum);
		System.out.println(std1.getStudentId());
		
		Student std2 = new Student();
		seriesNum = Student.serialNum++; // 1000
		std2.setStudentId(seriesNum);
		System.out.println(std2.getStudentId());
		
		Student std3 = new Student();
		std3.setStudentId(Student.serialNum++);
		System.out.println(std3.getStudentId());
	}
}
