package java_20240123_inheritence;

public class FourCalculator {
	int first;
	int second;
	int result;
	public FourCalculator() {}
	public FourCalculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
		System.out.println(result);
	}
	public void sub() {
		result = first - second;
		System.out.println(result);
	}
	public void mul() {
		result = first * second;
		System.out.println(result);
	}
	public void div() {
		result = first / second;
		System.out.println(result);
	}
}
