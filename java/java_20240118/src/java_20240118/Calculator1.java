package java_20240118;

public class Calculator1 {
	private int first; // 멤버 변수, 멤버 필드
	private int second;
	private int result;
	public Calculator1() {} // default 생성자
	public Calculator1(int first, int second) { // 생성자
		this.first = first;
		this.second = second;
	}
	public int add() {
		return first + second;
	}
}
