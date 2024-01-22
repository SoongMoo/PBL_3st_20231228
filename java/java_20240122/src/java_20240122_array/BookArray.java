package java_20240122_array;

public class BookArray {
	public static void main(String[] args) {
		Book b0 = new Book("태백산맥","조정래");
		Book b1 = new Book("토지", "박경리");
		Book b2 = new Book("어린왕자", "생텍쥐베리");
		//...
		Book [] library = new Book[100];
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("토지", "박경리");
		library[2] = new Book("어린왕자", "생텍쥐베리");
		//...library[99] 
		System.out.println(b0.getBookName());
		System.out.println(library[0].getBookName());
	}
}
