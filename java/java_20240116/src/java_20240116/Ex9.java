package java_20240116;

public class Ex9 {
	public static void main(String[] args) {
		int i;
		int j;
		i = 10;
		i = i - 1; // 9
		j = i; // 9
		System.out.println(i);
		System.out.println(j);
		i = 10;
		j = --i; // i = i - 1; j = i;  // 선행
		System.out.println(i); // 9
		System.out.println(j); // 9
		
		i = 10;
		j = i;
		i = i - 1;
		System.out.println(i); // 9
		System.out.println(j); // 10
		i = 10;
		j = i--; // j = i; i = i - 1; // 후행
		
	}
}
