package java_20240122_array;

public class ObjectArray {
	public static void main(String[] args) {
		int i0 = 10;
		int i1 = 20;
		//...
		int i10 = 100;
		int [] i = new int[100]; // 배열 , 0, 1, 2, 3, 4,..., 99
		double [] d = new double[5]; // 0, 1, 2, 3, 4
		i[0] = 10;
		i[1] = 11;
		d[0] = 0.5;
		d[1] = 1.5;
		d[2] = 2.5;
		d[3] = 3.5;
		d[4] = 4.5;
		for (double r : d) { // forEach
			System.out.println(r);
		}
	}
}
