package java_20240125_exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int first = 10;
		int second = 0;
		if (second == 0) {
			System.out.println(0);
		}else {
			System.out.println(first / second);
		}
		try {
			System.out.println(10 / 0);
		}catch(ArithmeticException e) {
			System.out.println(0);
		}catch(RuntimeException e) {
			System.out.println(0);
		}catch (Exception e) {
			System.out.println(0);
		}
		try {
			System.out.println(10 / 0);
		}catch (Exception e) {
			System.out.println(0);
		}
		
		int i[] = new int[2]; //0, 1
		try {    /// if
			i[2] = 10;
			System.out.println(i[2]);
		}catch(ArrayIndexOutOfBoundsException e) { // else
			System.out.println("배열 인덱스가 아닙니다.");
		}
	}
}
