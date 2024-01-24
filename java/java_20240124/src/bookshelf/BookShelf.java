package bookshelf;

public class BookShelf extends Shelf implements Queue{
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	@Override
	public String deQueue() { // 리스트에서 맨앞의 요소삭제
		return shelf.remove(0); // remove : pop
	}
	@Override
	public int getSize() {
		return getCount();
	}
}
