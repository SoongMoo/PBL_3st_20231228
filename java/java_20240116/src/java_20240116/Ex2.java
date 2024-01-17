package java_20240116;

public class Ex2 {
	public static void main(String[] args) {
		// 산술연산 ( +, -, * , /, %)
		//나머지 연산자 : %
		double i = 10.0;
		double j = 3.0;
		double result;
		result = i / j;  // result = 10.0 / 3.0
		System.out.println(result);
		result = i % j; // 나머지
		System.out.println(result);
		// 몫
		int z = (int)(i / j);
		System.out.println(z);
	}
}