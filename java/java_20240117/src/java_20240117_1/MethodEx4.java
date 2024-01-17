package java_20240117_1;

import java.util.Scanner;

public class MethodEx4 {
	public static void main(String[] args) {
		add();
	}
	static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번재 숫자를 입력해주세요. : ");
		int x = sc.nextInt();
		System.out.print("두 번재 숫자를 입력해주세요. : ");
		int y = sc.nextInt();;
		int result = x + y;
		System.out.println(result);
	}
}
