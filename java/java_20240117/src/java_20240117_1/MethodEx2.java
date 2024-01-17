package java_20240117_1;

public class MethodEx2 {
/// 메서드를 만드는 4가지 유형
	public static void main(String[] args) {
		int z = add(10, 20);
		System.out.println(z);
		z = add();
		System.out.println(z);
		add1(10, 20);
		add1();
	}
	/// 1.유형(기본유형 : 입력값(매개변수)이있고 결과값(return)이 있는 경우)
	static int add(int x, int y) {
		int result = x + y;
		return result;
	}
	// 2.유형 : 입력없고 결과값만 있는 경우
	static int add(){
		int x = 10;
		int y = 20;
		int result = x + y;
		return result;
	}
	/// 3. 입력값이 있고 결과값이 없는 경우
	static void add1(int x, int y) {
		System.out.println(x + y);
		return;
	}
	/// 4. 입력값도 없고 결과값도 없는 경우
	static void add1() {
		int x = 10;
		int y = 20;
		System.out.println(x + y);
		return;
	}
}
