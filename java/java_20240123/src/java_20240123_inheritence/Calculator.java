package java_20240123_inheritence;

public class Calculator {
	int first;
	int second;
	int result;
	public Calculator() {}
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
		System.out.println("부모객체 생성");
	}
	public void add() {
		result = first + second; 
		System.out.println(result);
	}
	public void div() {
		result = first / second; 
		System.out.println(result);
	}
}
