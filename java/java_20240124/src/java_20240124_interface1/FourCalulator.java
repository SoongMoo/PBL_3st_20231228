package java_20240124_interface1;

public class FourCalulator extends Calulator{
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	@Override
	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	@Override
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
