package java_20240117_1;

public class Calculator {
	int first;   // 멤버 변수, 멤버필드
	int second;
	int result;
	// 피호출메서드
	  ///              매개변수:가인자
	 ///               parameter
	public void setData(int first, int second) { // 10, 20
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first - second;
	}
	public void div() { // 메서드
		result = first / second;
	}
}

