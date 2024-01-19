package java_20240119_array;

public class ArrayTest1 {

	public static void main(String[] args) {
		double d0 = 10.5;
		double d1 = 20.5;
		double d2 = 30.5;
		
		double dd [] = {10.5, 20.5, 30.5};
		double [] dd1 = new double[] {10.5, 20.5, 30.5};
		double dd2 [] = new double[3]; //크기
		dd2[0] = 10.5;
		dd2[1] = 20.5;
		dd2[2] = 30.5;
		double [] dd3; // 배열 변수선언
		dd3 = new double[] {10.5, 20.5, 30.5};
		double [] dd4;
		dd4 = new double[3];
		dd4[0] = 10.5;
		dd4[1] = 20.5;
		dd4[2] = 30.5;
		System.out.println(dd4.length); // 3
		for (int i =0; i <= dd4.length - 1 ; i++) {
			System.out.println(dd4[i]);
		}
		for(double d : dd4) {
			System.out.println(d);
		}
	}
}
