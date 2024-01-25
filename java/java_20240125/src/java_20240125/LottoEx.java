package java_20240125;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoEx {
	public static void main(String[] args) {
		ArrayList<Integer> lottoNum = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("구매수량을 입력하세요. : ");
			int qty = sc.nextInt();
			for (int cnt = 1; cnt <= qty; cnt++) {
				for (int i = 1; i <= 45; i++) {
					lottoNum.add(i); //
				}
				int size = lottoNum.size(); // 45
				for (int i = 1; i <= 6; i++) {
					size--; // 44
					int idx = (int) (Math.random() * (size + 1)); // 0 ~ 44
					int num = lottoNum.remove(idx);
					System.out.print(num + ", ");
				}
				lottoNum.clear();
				System.out.println();
			}
			System.out.print("종료하려면 'Y'를 계속하려면 아무키나 : ");
			sc.nextLine();
			String stop = sc.nextLine();
			if(stop.equals("Y") || stop.equals("y")) {
				break;
			}
		}
	}
}