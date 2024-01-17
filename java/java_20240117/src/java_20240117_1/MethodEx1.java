package java_20240117_1;

public class MethodEx1 {
	public static void main(String[] args) {
		int i = 10;
		int y = f(4);
		System.out.println(y);
		y = f(10);
		System.out.println(y);
		
		double z  = div(10.0, 20.0);
		add(10, 20);
	}
	//메서드
	// f(x) = 3x + 4이라할 때 
	// y = f(4)라면 y값은?
	// y = f(8)라면 y값은?
	public static int f(int x) {
		return 3*x + 4;
	}        //   반환형
	public static double div(double x, double y) {
		return x / y;
	}
	public static void add(double x, double y) {
		System.out.println(x + y);
		return ;
	}
}
