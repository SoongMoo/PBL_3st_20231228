package java_20240116;

public class Ex13 {
	public static void main(String[] args) {
		// 2장
		int i; /// 선언
		i = 10; // 대입
		int j = 10; // 초기화
		// 자료형 : 정수자료형, 실수 자료형, 문자자료형, 문자열자료형
		//          부울자료형
		String str = "hello java";
		char ch = 'A';
		// 자동형변환, 강제형변환
		// 3장 : 연산자
		// 일항연산자 :
		//              부호연산자 : -, ++, --
		// 이항연산자 :
		//              산술연산자 : +,-, *, /, %
		//              대입연산자 : =, +=,-=,*=, /=, %=
		//              관계연산자 : >, <, <=, >=, ==, !=
		//              논리연산자 : &&(and), ||(or)
		// 삼항연산자 :
		//              조건연산자 : a ? b: c
		// 각 과목이 40점이상이고 평균60점이상이어야 합격이다.
		 int mat = 45;
		 int eng = 80;
		 int kor = 65;
		 boolean pass = mat >= 40 && eng >= 40 && kor >= 40  
				 && (mat+kor+eng) / 3 >= 60 ;
		System.out.println(pass);
		String str1 = pass ? "합격" : "불합격";
		System.out.println(str1);
	}
}