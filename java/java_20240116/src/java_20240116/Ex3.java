package java_20240116;

public class Ex3 {
	public static void main(String[] args) {
		short s = 10;
		int i = 20;
		long l = s + i; // 2byte + 4byte
		                // 4byte + 4byte = 4byte
		// long = 4byte : 8byte = 4byte : 8byte = 8byte
		l = 40 + 30; // 4byte + 4byte
		// 정수의 기본 자료형은 4byte이다
		l = 40 + s; // 4byte + 2byte
		double result = 10.5 + 4;     // 8byte + 4byte
		                              // 8byte + 8byte
		float f  = 10.4F; // 8byte => 4byte
		float f1 = (float)10.4;
		System.out.println(l);
		// 정수리터널 : 4byte
		// 실수리터널 : 8byte
		result = 10.5 + 20.5; // 8byte + 8byte
		result = 20.5 + f1;   // 8byte + 4byte => 8byte + 8byte
	}
}
