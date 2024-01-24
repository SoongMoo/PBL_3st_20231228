package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		bookShelf.enQueue("태백산맥1");
		bookShelf.enQueue("태백산맥2");
		bookShelf.enQueue("태백산맥3");
		for(String title : bookShelf.getShelf()) {
			System.out.println(title); 
		}
		System.out.println(bookShelf.getCount());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.getCount());
	}
}
