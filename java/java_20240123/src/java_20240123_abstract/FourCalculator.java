package java_20240123_abstract;

public class FourCalculator extends Calculator{
	public FourCalculator(int first, int second) {
		super(first, second);
	}
	@Override
	public void div() {
		if(second == 0) 
			System.out.println(0);
		else System.out.println(first/second);
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
