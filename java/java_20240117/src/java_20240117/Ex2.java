package java_20240117;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// 1 ~ 100
		int num = 0;
		System.out.print("시작 숫자를 입력하세요. : ");
		int start = sc.nextInt();
		System.out.print("마지막 숫자를 입력해주세요. : ");
		int end = sc.nextInt();
		for(int i = start ; i <= end ; i++) {
			num += i;
		}
		System.out.println(num);
	}

}
