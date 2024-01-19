package java_20240119;

public class Student1Ex {
	public static void main(String[] args) {
		Student1 std = new Student1();
		std.setStudentId(1234); // int studentId = 1234
		std.setStudentName("이숭무"); // String studentName = "이숭무"
		std.setKorea(new Subject()); // Subject korea = new Subject()
		std.getKorea().setSubjectName("국어");
		std.getKorea().setScore(50);

		Subject math = new Subject();
		math.setSubjectName("수학");
		math.setScore(100);
		std.setMath(math);
		
		System.out.println(std.getMath().getScore());
		System.out.println(std.getKorea().getScore());
		
		
		
	}
}
