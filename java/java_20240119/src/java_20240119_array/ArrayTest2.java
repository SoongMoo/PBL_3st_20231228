package java_20240119_array;

public class ArrayTest2 {
	public static void main(String[] args) {
		double dd [] = new double[5]; // 값을 저장하지 않으면 0.0으로 초기화된다.
		int size= 0;
		dd[0] = 10.5; size ++;
		dd[1] = 20.5; size ++;
		dd[2] = 30.5; size ++;
		
		for(int i = 0; i < size ;i++) {
			System.out.println(dd[i]);
		}
		
		for(double x : dd) {
			System.out.println(x);
		}
	}
}
