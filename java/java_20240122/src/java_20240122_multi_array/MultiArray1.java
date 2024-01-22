package java_20240122_multi_array;

public class MultiArray1 {
	public static void main(String[] args) {
		int i0 = 10;
		int i1 = 20;
		int i3 = 30;
		int i[] = new int[3]; // [ ][ ][ ] : i   : 1차원배열
		                     //   0  1  2
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		int ii[] = new int[3]; // [ ][ ][ ] : ii  : 1차원배열
		//                         0  1  2
		ii[0] = 40;
		ii[1] = 50;
		ii[2] = 60;
		// 2차원배열은 1차원배열의 집합체이다.
		int [][] j = new int [2][3]; // [[10][20][30]]  i   : j[0]
									 // [[40][50][60]]  ii  : j[1]
		                             //    0   1   2
		j[0] = i;
		j[1] = ii;
		System.out.println(i[0]);
		System.out.println(j[0][0]);
		System.out.println(ii[0]);
		System.out.println(j[1][0]);
		
	}
}
