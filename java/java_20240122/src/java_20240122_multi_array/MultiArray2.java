package java_20240122_multi_array;

public class MultiArray2 {

	public static void main(String[] args) {
		// 일차원 배열
		int i [] = {1,2,3,4};
		int i1 [] = new int[] {1,2,3,4};
		int i2 [];
		i2 = new int[] {1,2,3,4};
		int i3 [] = new int[3];
		i3[0] = 10;
		int i4 [];
		i4 = new int[3];
		i4[0] = 10;
		// 이차원배열
		int [][] mi = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] mi2 = {{1,2,3}, {4,5}, {6,7,8,9}};
		int [] m1 = {1,2,3};
		int [] m2 = {4,5};
		int [] m3 = {6,7,8,9};
		int [][] m13 = new int[3][];
		m13[0] = m1;
		m13[1] = m2;
		m13[2] = m3;
		
		int mi3 [][] = new int[][] {{1,2,3},{4,5},{6,7,8,9}};
		// [0][0], [0][1],[0][2]
		System.out.println(mi3.length); // 2차원배열의 크기 : 1차원갯수
		System.out.println(mi3[0].length); //1차원배열의 크기
		for (int row = 0; row < mi3.length ; row++) {
			for(int col = 0; col < mi3[row].length ; col ++) {
				System.out.println(mi3[row][col]);
			}
		}	
		

	}

}
