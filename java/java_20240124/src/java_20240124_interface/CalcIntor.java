package java_20240124_interface;

public class CalcIntor implements CalcInterface1{
	@Override
	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	@Override
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);		
	}
}
