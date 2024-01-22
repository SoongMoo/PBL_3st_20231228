package java_20240122_array;

public class Student {
	int studentId;
	String studentName;
	String grand;
	public Student(int studentId, String studentName, String grand) { // 멤버변수를 초기화
		this.studentId = studentId;
		this.studentName = studentName;
		this.grand = grand;
	}
	// 멤버변수에게 값을 저장 : setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setGrand(String grand) {
		this.grand = grand;
	}
	/// 멤버변수가 가지고 있는 값을 전달 : getter
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getGrand() {
		return grand;
	}
	
	
}
