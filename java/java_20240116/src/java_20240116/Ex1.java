package java_20240116;

public class Ex1 {
	public static void main(String[] args) {
		//정수형 : int , long
		// 실수 : double
		// 문자 : char
		// 문자열 : String
		// 부울 : boolean
		// 변수 = 값
		int i; // 선언
		i = 1000; // 대입
		short s = 1000; // 초기화
		i = s; // int = short  : 묵시적 형변환, 자동형변환
		// i = 1000;
		System.out.println(i);
		//short s; //같은 이름으로 선언은 다시 할 수 없다.
		short s1 = 872; 
		byte b = (byte)s1; // byte = short : 강제형변환
		// b = 872; // -128 ~ 127
		System.out.println(b);
		b = (byte)1000;
		System.out.println(b);
	}
}
