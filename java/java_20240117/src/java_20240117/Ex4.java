package java_20240117;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단의 시작 숫자를 입력해주세요. : ");
		int startDan = sc.nextInt();
		System.out.print("단의 마지막 숫자를 입력해주세요. : ");
		int endDan = sc.nextInt();
		System.out.print("곱의 시작 숫자를 입력해주세요. : ");
		int startGop = sc.nextInt();
		System.out.print("곱의 마지막 숫자를 입력해주세요. : ");
		int endGop = sc.nextInt();
		for(int dan = startDan; dan <= endDan; dan ++) {
			for (int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}
