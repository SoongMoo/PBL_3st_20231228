package java_20240124_interface1;

public abstract class Calulator implements Calc {
	public abstract void mul(int num1, int num2);
	public abstract void div(int num1, int num2);
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
}
