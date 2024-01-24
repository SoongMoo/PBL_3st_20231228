package java_20240124_abstract;

public class FourCalculator extends Calculator{
	public FourCalculator(int first, int second) {
		super(first, second);
	}
	/*
	@Override  
	public void add() { // final메서드이므로 override를 할 수 없다.
		result = first + second + 5;
		System.out.println(result);
	}
	*/
	@Override
	public void div() {
		if(second == 0)result = 0;
		else result = first/second;
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
}