package java_20240117;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 곱을 입력하세요. : ");
		int startGop = sc.nextInt();
		System.out.print("마지막 곱을 입력하세요. : ");
		int endGop = sc.nextInt();
		
		int start = startGop;
		while(start <= endGop) {
			System.out.println("5 * " + start + " = " + 5 * start);
			start++;
		}
	}
}
