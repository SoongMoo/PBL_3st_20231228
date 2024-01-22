package java_20240122_multi_array;

public class MultiArray {

	public static void main(String[] args) {
		int j0 = 10;
		int j1 = 20;
		int j3 = 30;
		int [] j = new int[3];
		
		int [] i1 = new int[3];      // [ ][ ][ ]  : i1
		int [] i2 = new int[3];      // [ ][ ][ ]  : i2
		int [] i3 = new int[3];      // [ ][ ][ ]  : i3
		int [] i4 = new int[3];      // [ ][ ][ ]  : i4
		///                              0  1  2
		i1[0] = 10;
		i2[0] = 20;
		int [][] ii1 = new int[4][3]; 
		// [new int[3]][new int[3]][new int[3]][new int[3]]
		ii1[0] = new int[3];      // [0 0][0 1][0 2]  : ii1[0]
		ii1[1] = new int[3];      // [1 0][1 1][1 2]  : ii1[1]
		ii1[2] = new int[3];      // [2 0][2 1][2 2]  : ii1[2]
		ii1[3] = new int[3];      // [3 0][3 1][3 2]  : ii1[3]
		                          //  0  1  2
		ii1[0][0] = 10;
		ii1[1][0] = 20;
		ii1[1][1] = 10;
		ii1[2][0] = 30;
		ii1[3][0] = 40;
		ii1[3][2] = 50;                    
	}

}
