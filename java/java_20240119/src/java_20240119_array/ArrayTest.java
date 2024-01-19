package java_20240119_array;

public class ArrayTest {
	public static void main(String[] args) {
		int i0 = 10;
		int i1 = 20;
		int i2 = 30;
		int i3 = 40;
		
		int [] i = {10, 20, 30, 40}; // 배열 초기화
		//          0   1   2   3 : 요소번호 : index : 0부터 시작한다.
		System.out.println(i0);
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		int [] ii = new int[] {10, 20, 30, 40, 50};
		int [] iii = new int[4];   // 0, 1, 2, 3 
		// 배열객체 생성, 배열을 초기화하지 않은 경우 크기 지정
		iii[0] = 10;
		iii[1] = 20;
		iii[2] = 30;
		iii[3] = 40;
		//iii[4] = 50;
		//System.out.println(iii[4]); ///Index 4 out of bounds
		System.out.println(iii[0]);
		System.out.println(iii[1]);
		System.out.println(iii[2]);
		System.out.println(iii[3]);
		
		for (int x = 0; x <= 3; x++) {
			System.out.println(iii[x]);
		}
		// 반복문 : for, while, forEach
		for( int  y : iii) { // 10,20, 30, 40
			System.out.println(y);
		}
	}
}