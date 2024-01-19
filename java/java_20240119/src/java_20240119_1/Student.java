package java_20240119_1;

public class Student {
	String studentName;
	int grade;
	int money;
	public Student(int money, String studentName) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	public void takeSubway(SubWay subWay) {
		subWay.take(1500);
		money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " +
						   money + "원입니다. ");
	}
	
}
