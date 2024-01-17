package java_20240115;

public class Ex5 {

	public static void main(String[] args) {
		// 자료형 
		// 문자 자료형
		char ch = 'A'; // char : 정수 자료형, 2바이트
		System.out.println(ch);
		//  문자 대신 숫자로 만든 코드표 : ascii, uft-16
		ch = 65; // ascii코드
		System.out.println(ch); // 'A'
		ch = 66;
		System.out.println(ch);
		ch = '이';
		System.out.println(ch);
		System.out.println((int)ch);
		ch = 51060;
		System.out.println(ch);
		// ch = -65; 0부터 시작하는 값 UNSIGNED
		String str; // 선언
		str = "이숭무"; // 두글자
		System.out.println(str);
	}
}
