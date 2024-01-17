package java_20240117;

public class Ex11 {

	public static void main(String[] args) {
		// 1 ~ 100
		int num = 0;
		for(int i = 1; i<=100; i++) {
			num += i;
		}
		System.out.println(num);
		num = 0;
		int i = 1;
		while(i<=100) {
			num += i;
			i++;
		}
		System.out.println(num);
		System.out.println("====");
		
		num = 0;
		i = 1;
		while(true) {
			num += i;
			if(i == 100) break; // 반복문을 중지시킴
			i++;
		}
		System.out.println(num);
		num = 0;
		for(i = 1;  ; i++) {
			num+=i;
			if (i == 100) break; // 반복문을 중지시킴
		}
		System.out.println(num);
		
	}

}
