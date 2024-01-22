package java_20240122_array;

public class Book {
	String bookName;
	String author;
	// 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	// setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	// getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}	
	public void print() {
		System.out.println("책이름은 " + bookName + "이고 저자는 " + author);
	}
}
