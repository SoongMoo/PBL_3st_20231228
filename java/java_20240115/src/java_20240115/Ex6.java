package java_20240115;

public class Ex6 {

	public static void main(String[] args) {
		// 정수 자료형
		/*
		byte b = 10; // -128~ 127
		short sh = 10000; //  -32768 ~ 32767
		*/
		int i = 210000; // -2147683648 ~ 2147683647
		long l = 2147683648L;
		//문자 자료형
		char ch = 66; // 정수자료형
		ch = 'A' ; 
		System.out.println((int)ch); // 인코딩
		// 실수 자료형
		float f = 10.5f;
		double d = 10.5;
		// 문자열 자료형
		String str = "이";
		str = "이숭무";
		// 자료형없는 변수 선언 // 10버전, 사용하지 않는다.
		var v1 = 10;
		System.out.println(v1);
		System.out.println(true);
		// 부울 자료형
		boolean bl = true;
		bl = false;
		System.out.println(bl);
		
		int ch3 = 66;
		System.out.println(ch3);
		System.out.println((char)ch3); // 디코딩
	}

}
