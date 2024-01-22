package java_20240122_array;

public class ObjectArray3 {

	public static void main(String[] args) {
		int i [] = new int[10]; // 0으로 초기화 [10][20][0][0][0][0][0][0][0][0]
		                        //               0 1 2 3 4 5 6 7 8 9
		i[0] = 10;              
		i[1] = 20;
		for (int i1 : i) {
			System.out.println(i1);
		}
		// 객체 배열은 null로 초기화가 된다.
		Book [] library = new Book[10];// [Book][Book][null][null][null][null][null][][][]
		                                //  0      1     2     3     4     5     6 7 8 9
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("토지", "박경리");
		for (Book b : library) {
			System.out.println(b);
		}
	}

}
