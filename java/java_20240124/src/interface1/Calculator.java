package interface1;

public class Calculator implements Calc{
	int first;
	int second;
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	@Override
	public int sub() {
		return first - second;
	}
	@Override
	public void mul() {
		System.out.println(first * second);
	}
}
