package java_20240116;

public class Ex11 {
	public static void main(String[] args) {
		//부울타입(true/false)의 연산 : 논리연산 : &&(and), ||(or)
		boolean b; // 
		b = true && true;
		System.out.println(b);
		b = true || false;
		System.out.println(b);
		/*
		 * 논리연산을 하기 위해서는 부울타입이 필요하다.
		 * 연산결과 부울타입인 것과 연산을 할 때 논리연산이 필요.
		 * 부울타입이 결과인 연산자는 비교(관계)연산자 
		 */
		// 2200은 윤년입니까?
		// 4년 마다 윤년, 100년 마다 평년, 400년마다 윤년
		// year % 4 == 0 , year % 100 == 0, year % 400 == 0
		// year % 4 != 0, year % 100 != 0
		int year = 2200;
		boolean result; // 윤년이면 true/ 평년이면 false
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		//          ture       &&   false         ||    false    
		System.out.println(result);
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		if(result) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		} /// 산술연산자, 관계연산과 논리연산
		
		
		// >, < , >=, <=, ==, !=
		int i = 10;
		int j = 20;
		result = i > j;
		System.out.println(result);
		result = i < j;
		System.out.println(result);
		result = i != j;
		System.out.println(result);
	}
}
