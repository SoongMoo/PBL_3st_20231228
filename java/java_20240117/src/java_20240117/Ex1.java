package java_20240117;

public class Ex1 {
	public static void main(String[] args) {
		// 5단
		for(int gop = 1 ; gop <= 9 ; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		// 1 ~ 10까지의 합
		int num = 1;
		num = num + 1; // num = 1 + 1 = 2
		num = num + 2; // num = 2 + 2 = 4
		num = num + 3; // num = 4 + 3 = 7
		//...
		num = num + 10;// num = 46 + 10 = 56
		
		num = 1;   
		for (int i = 1; i <= 10 ; i++) {
			num += i;//num = num + i;
		}
		System.out.println(num);
	}
}
