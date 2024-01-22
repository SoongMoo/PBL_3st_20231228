package java_20240122_arraylist;

public class Subject {
	String subjectName;
	int subjectScore;
	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectScore() {
		return subjectScore;
	}
	public void setSubjectScore(int subjectScore) {
		this.subjectScore = subjectScore;
	}
}
