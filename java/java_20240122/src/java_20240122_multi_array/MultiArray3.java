package java_20240122_multi_array;

public class MultiArray3 {

	public static void main(String[] args) {
		int [][] m = new int [3][4];
		                            // m.length :행의 갯수
		m[0] = new int[] {1,2,3,4}; //  [0][0],[0][1],[0][2],[0][3] : m[0].length : m[row].length
		m[1] = new int[] {5,6,7,8}; //  [1][0],[1][1],[1][2],[1][3] : m[1].length : m[row].length
		m[2] = new int[] {9,10,11,12};//[2][0],[2][1],[2][2],[2][3] : m[2].length : m[row].length
		for(int row = 0 ; row < 3; row++) {
			for(int col = 0; col < 4; col++) {
				System.out.println("m["+row+"]["+col+"] = " + m[row][col]);
			}
		}
		for(int row = 0 ; row < m.length; row++) {
			for(int col = 0; col < m[row].length; col++) {
				System.out.println("m["+row+"]["+col+"] = " + m[row][col]);
			}
		}
		int [][] mi = new int [][] {{1,2,3,4},{3,4,5},{6,7,8,9,10}};
		// mi.length : 3
		// [[1][2][3][4]]       : mi[0]  , mi[0].length
		// [[3][4][5]]          : mi[1]  , mi[1].length
		// [[6][7][8][9][10]]   : mi[2]  , mi[2].length
		for(int row = 0; row < mi.length ; row++) {
			for(int col = 0; col < mi[row].length; col++) {
				System.out.println("mi["+row+"]["+col+"] = " + mi[row][col]);
			}
		}
		int row = 0;
		for( int [] mm  : mi) {
			int col = 0;
			for( int x : mm) {
				System.out.println("mi["+row+"]["+col+"] = " + x);
				col ++;
			}
			row++;
		}
	}
}
