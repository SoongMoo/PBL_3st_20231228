package java_20240117;

public class Ex3 {
	public static void main(String[] args) {
		// 3단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("3 * " + gop + " = " + 3 * gop);
		}
		// 4단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("4 * " + gop + " = " + 4 * gop);
		}
		// 5단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
		}
		// 6단
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
		}
		System.out.println("===");
		for(int dan = 2; dan <= 9; dan ++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
			}
		}
	}
}



