package java_20240117;

public class Ex9 {

	public static void main(String[] args) {
		int gop = 1;
		while(gop <= 9) {
			System.out.println("5 * " + gop + " = " + 5 * gop);
			gop++;
		}
		gop = 1;
		while(gop <= 9) {
			System.out.println("6 * " + gop + " = " + 6 * gop);
			gop++;
		}
		gop = 1;
		while(gop <= 9) {
			System.out.println("7 * " + gop + " = " + 7 * gop);
			gop++;
		}
		System.out.println("====");
		int dan = 5;
		while(dan <= 7) {
			gop = 1;
			while(gop <= 9) {
				System.out.println(dan + " * " + gop + " = " + dan * gop);
				gop++;
			}
			dan++;
		}
	}
}
