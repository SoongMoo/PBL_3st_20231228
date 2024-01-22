package java_20240122_arraylist;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList; 
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Subject>(); //list객체 생성
	}
	public void add(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		subjectList.add(subject);
	}
	public void showSutudentPrint() {
		for(Subject sub : subjectList) {
			System.out.println("학생 " + studentName + "의 " + sub.getSubjectName() 
			 						   + "과목의 점수는 " +  sub.subjectScore + "입니다.");
		}
	}
}