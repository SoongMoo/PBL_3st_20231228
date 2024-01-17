package java_20240117_1;

public class Calculator1Ex1 {
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		int result = calc.sub(20, 10);
		
		calc.add(10, 20);
		int y = f(4);
		System.out.println(y);
		y = f(6);
		System.out.println(y);
	}
	/// x값에 따라 y값의 변화가 어떻게 되는지?
	/// f(x) = 3x + 4일때 
	/// y = f(4)라면 y값은?
	/// y = f(6)라면 y값은?
	public static int f(int x) {
		return 3*x + 4;
	}
}
