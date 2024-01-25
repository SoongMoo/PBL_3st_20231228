package java_20240125_map;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("이숭무"); // 0     : index
		list.add("이상범"); // 1
		list.add("이장범"); // 2     
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		String result = list.remove(0);
		System.out.println(result);
		boolean b = list.remove("이장범");
		System.out.println(b);
				b = list.remove("이숭무");
		System.out.println(b);
		System.out.println(list.size());
		System.out.println(list.indexOf("이상범"));
		list.clear();
		System.out.println(list.size());
		
		/// index를 사용하지 않는다.
		///      키       값
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이숭무");
		map.put(8, "이상범");
		map.put(6, "이장범");
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		map.put(1, "오연의"); // 키가 있으면 수정, 키가 없으면 삽입
		System.out.println(map.get(1));
		map.put(10, "김찬중");
		
		String str = map.remove(1); // 대입 후 삭제
		System.out.println(str);
		System.out.println(map.size());
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty()); // 비어 있으면 True
		
		list.add("이숭무");
		list.add("이장범");
		list.add("오연의");
		for(String s : list) {
			System.out.println(s);
		}
		map.put(1, "이숭무");
		map.put(8, "이장범");
		map.put(10, "오연의");
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		for(Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}