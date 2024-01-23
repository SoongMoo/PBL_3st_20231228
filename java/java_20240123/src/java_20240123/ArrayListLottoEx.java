package java_20240123;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListLottoEx {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또프로그램 시작");
		System.out.print("구매 수량을 입력하세요. ");
		int cnt = sc.nextInt();
		for(int i = 1; i <= cnt; i++) {
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for(int j = 1; j <= 45 ; j ++) {
				lotto.add(j);
			}
			int size = lotto.size(); //45
			for(int x = 1 ; x <= 6 ; x++) {
				size--; // 44
				int index =(int)(Math.random() * size + 1);// 0.0000 ~ 0.9999 * 45 = 0.000 ~ 44.999999
				            // 0 ~ 44
				int result = lotto.get(index);
				lotto.remove(index);   // 비복원추출
				System.out.print(result + ", ");
				
			}
			System.out.println();
		}
	}
}