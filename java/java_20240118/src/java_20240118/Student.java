package java_20240118;

public class Student {
	int studentId;
	String studentName;
	int koreaScore;
	int matScore;

	// 기본생성자 : default 생성자
	public Student() {} // 오버로드
	// 메서드명은 같고 매개변수의 갯수나 매개변수의 타입의 순서가 
	// 다르면 된다.
	public Student(int studentId, String studentName,
			int koreaScore, int matScore) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.koreaScore = koreaScore;
		this.matScore = matScore;
	}
	public Student(int studentId, int koreaScore, 
			int matScore, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.koreaScore = koreaScore;
		this.matScore = matScore;
	}
	public Student(int studentId, String studentName,
			int koreaScore) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.koreaScore = koreaScore;
		this.matScore = 50;
	}
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.koreaScore = 50;
		this.matScore = 50;
	}
	
}
