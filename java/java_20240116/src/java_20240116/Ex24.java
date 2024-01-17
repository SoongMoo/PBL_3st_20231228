package java_20240116;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력 해주세요. : ");
		int dan = sc.nextInt();
		for(int start = 1 ; start <= 10 ; start++) {
			System.out.println(dan + " * " + start + " = " + dan * start);
		}
	}
}
