package bookshelf;

import java.util.ArrayList;

public class Shelf {
	ArrayList<String> shelf;

	public Shelf() {
		this.shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
