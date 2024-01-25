package java_20240125_wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		int i = 10;
		Integer i1 = 10; // Integer를 Wrapper자료형 // boxing
		int j = i1;      // unboxing
		String str = "10";
		System.out.println( 10 + str); // 1010
		System.out.println( 10 + Integer.parseInt(str));
		//int x = (int)str;
		int iii = (int)10.5 + (int)20.5;
		// 문자열을 정수,실수로 변경하는 것 parsing
		String str1 = "100";
		System.out.println(String.valueOf(100) + str1); 
		System.out.println(Integer.toString(100) + str1);
		int z = 0;
		Integer z1 = null;
	}

}
