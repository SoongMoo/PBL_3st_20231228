package java_20240116;

public class Ex22 {
	public static void main(String[] args) {
		// if , switch : 조건문
		// for, while, forEach : 반복문 : 명령문이 반복적으로 사용될 때
		// for문
		System.out.println("나무를 1번 찍었습니다.");
		System.out.println("나무를 2번 찍었습니다.");
		System.out.println("나무를 3번 찍었습니다.");
		System.out.println("나무를 4번 찍었습니다.");
		System.out.println("나무를 5번 찍었습니다.");
		System.out.println("나무를 6번 찍었습니다.");
		System.out.println("나무를 7번 찍었습니다.");
		System.out.println("나무를 8번 찍었습니다.");
		System.out.println("나무를 9번 찍었습니다.");
		System.out.println("나무를 10번 찍었습니다.");
		System.out.println("나무가 넘어갑니다.");
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("나무를 " + i +"번 찍었습니다.");
		}
		System.out.println("나무가 넘어갑니다.");
		int start = 1;
		int end = 10;
		for (int i = start ; i <= end ; i++) {
			System.out.println("나무를 " + i +"번 찍었습니다.");
		}
		System.out.println("나무가 넘어갑니다.");
	}
}
