package string;

public class Calculator {
	int first;
	int second;
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		System.out.println(first + second);
	}
}
