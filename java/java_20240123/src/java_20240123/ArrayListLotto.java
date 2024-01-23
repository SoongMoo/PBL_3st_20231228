package java_20240123;

import java.util.ArrayList;

public class ArrayListLotto {
	public static void main(String [] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>(); 
		/* 1 ~ 45를 리스트에 저장할 코드 작성*/
		for(int i = 1; i <= 45; i++) {
			lotto.add(i);
		}
		int size = lotto.size(); // 45
		for(int i = 0 ; i <= 5; i++) {
			size--; //44
			int idx = (int)(Math.random() * size + 1 /* 들어갈변수 */ ); // 0 ~ 44
			int result = lotto.get(idx);
			lotto.remove(idx);
			System.out.print(result + ", ");
		}
	}
}
