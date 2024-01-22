package java_20240122_arraylist;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		int [] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[2] = 3;
		//m[4] = 4; //(x)
		        //제네릭 
		System.out.println(m.length);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);   // 0
		list.add(20);   // 1
		list.add(30);   // 2
		list.add(40);   // 3
		System.out.println(list.size());
		list.remove(2); // index
		System.out.println(list.size());
		System.out.println(m[0]);
		System.out.println(list.get(0));
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("이숭무");
		list1.add("이상범");
		list1.add("이정범");
		System.out.println(list.get(1));
		list1.remove(0);        // index
		list1.remove("이정범"); // object
		System.out.println(list1.size()); // 1
	}
}
