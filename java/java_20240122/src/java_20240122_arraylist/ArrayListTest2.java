package java_20240122_arraylist;

import java.util.ArrayList;

import java_20240122_array.Book;

public class ArrayListTest2 {
	public static void main(String[] args) {		
		Book [] library = new Book[2]; // 객체배열
		library[0] = new Book("대백산맥", "이숭무");
		library[1] = new Book("무궁화꽃이피었습니다.", "이상범");
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("대백산맥", "이숭무"));
		list.add(new Book("무궁화꽃이피었습니다.", "이상범"));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		
		for(Book b : list) {
			b.print();
		}
		
		
	}
}
