package java_20240116;

public class Ex14 {
	public static void main(String[] args) {
		/*
		제어문 : 조건문 : if, switch ~ case 
		 		 반복문 : while , for, forEach
		*/
		/*
		 * 조건문 : 두개 이상에서 하나를 선택하는 것
		 *          선택이냐 아니냐
		 */
		// 돈이 3000원 이상이면 "차를 타고가시오"출력
		int money = 3000;
		boolean result = money >= 3000;
		if (money >= 3000) { // 결과 true 일때
			System.out.println("차를 타고가시오");
		}
		System.out.println("=====");
		money = 2000;
		if (money >= 3000) { // 결과가 false이므로 실행되지 않는다.
			System.out.println("차를 타고가시오");
		}
		int age = 7; 
		//  단일 if문
		if (age >= 8) { // if문의 결과가 true이면 실행이되고
			            //        결과가 false이면 실행되지 않는다.
			System.out.println("학교를 다닙니다.");
		}
	}
}
