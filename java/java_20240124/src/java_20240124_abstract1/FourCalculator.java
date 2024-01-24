package java_20240124_abstract1;

public class FourCalculator extends Calculator {
	@Override
	public void add(int first, int second) {
		System.out.println(first + second);
	}
	@Override
	public void sub(int first, int second) {}
	@Override
	public void mul(int first, int second) {}
	@Override
	public void div(int first, int second) {}
}
