package java_20240122_arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("이숭무");
		list.add("이상범");
		list.add("이장범");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		for(int idx = 0; idx < list.size() ; idx++) {
			System.out.println(list.get(idx));
		}
		for(String str : list) {
			System.out.println(str);
		}
	}
}
