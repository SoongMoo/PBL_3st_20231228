package java_20240119_static_method;


public class Student {
	private static int serialNum; // 정적변수 // 클래스변수
	
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	
	static {
		serialNum = 1000;
	}
	
	public static int getSerialNum() { // 정적 메서드 // 클래스 메서드
		return serialNum++;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
