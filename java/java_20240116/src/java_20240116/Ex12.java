package java_20240116;

public class Ex12 {

	public static void main(String[] args) {
		//삼항 연산자, 조건연산자
		int i;
		int j; 
		i = 10; //  대입연산자 ,  2항연산자
		j = i + 10; // 10 + 10 ; j = 20;
		System.out.println(-i); // -부호연산자
		String str = i > j ? "크다" : "작다";
		if (i > j) {
			str = "크다";
		}else {
			str = "작다";
		}
		System.out.println(str);
	}

}
