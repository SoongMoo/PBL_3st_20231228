package java_20240117;

public class Ex8 {

	public static void main(String[] args) {
		// 1 ~ 100
		int num = 0;
		for(int i = 1; i <= 100; i++) {
			num += i;
		}
		System.out.println(num); // 55
		System.out.println("=====");
		num = 0; // 초기화
		int j = 1;
		while(j <= 100) {
			num+=j;
			j++;
		}
		System.out.println(num);

	}

}
