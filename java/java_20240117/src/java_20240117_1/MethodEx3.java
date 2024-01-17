package java_20240117_1;

import java.util.Scanner;

public class MethodEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요. : ");
		int i = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요. : ");
		int y = sc.nextInt();;
		add(i, y);
	}
	/// 입력값이 있는 경우
	static void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
}
