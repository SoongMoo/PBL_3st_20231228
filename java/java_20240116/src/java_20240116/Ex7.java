package java_20240116;

public class Ex7 {
	public static void main(String [] args) {
		int i = 10;
		i++;
		System.out.println(i); // 11
		
		System.out.println(i++); // 11
		System.out.println(i); // 12
		
		System.out.println(i);
		i = i + 1; // 후행
		System.out.println(i);
		i = 10;
		i = i + 1;
		System.out.println(i); // 11
		// 선행
		System.out.println(++i); // 12 
		/* i = i + 1; System.out.println(i); */
	}
}
