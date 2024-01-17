package java_20240117;

public class Ex6 {

	public static void main(String[] args) {
		for(int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		System.out.println("=====");
		int start = 1;
		while(start <= 9) {
			System.out.println("5 * " + start + " = " + 5 * start);
			start++;
		}
	}
}
