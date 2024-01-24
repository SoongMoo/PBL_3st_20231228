package java_20240124_fianl;

public final class Calculator { //추상메서드를 가질수 없다.
	                            // 상속을 할 수 없다.
	final double PI = 3.141592; // 값을 변경하지 못하는 수 : 상수 선언
	int first;
	int second;
	double result;
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second + PI;
		System.out.println(result);
	}
}
