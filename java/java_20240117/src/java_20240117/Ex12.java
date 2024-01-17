package java_20240117;

public class Ex12 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하시오.
		int num = 0;
		for(int i = 1; i <= 100; i++) {
			num += i;
		}
		System.out.println(num);
		// 1부터 100까지 중 짝수의 합을 구하시오.
		num = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) num += i;
		}
		System.out.println(num);
		num = 0;
		for(int i = 1; i<= 100; i++) {
			if(i % 2 != 0) continue;
			num+=i;
		}
		System.out.println(num);
		num = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0)num += i;
			i++;
		}
		System.out.println(num);	
		num = 0;
		i = 0;
		while(i < 100) { // i <= 99
			i++;
			if (i % 2 != 0) continue;
			num += i;
		}
	}
}
