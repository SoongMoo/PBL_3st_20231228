package java_20240116;

public class Ex8 {
	public static void main(String[] args) {
		int i = 10;
		int j ;
		i = i + 1; // 11 : i++, ++i
		j = i; // 11
		System.out.println(i);  // 11
		System.out.println(j);  // 11
		i = 10;
		j = ++i; // i = i + 1; j = i;
		System.out.println(i); // 11
		System.out.println(j); // 11
		
		i = 10;
		j = i;
		i = i + 1;
		System.out.println(i); // 11
		System.out.println(j); // 10
		i = 10;
		j = i++; // j = i ; j = j + 1;
		System.out.println(i); // 11
		System.out.println(j); // 10
		
		
		
		
		
	}
}
