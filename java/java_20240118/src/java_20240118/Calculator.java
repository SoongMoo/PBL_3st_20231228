package java_20240118;

public class Calculator {
	private int first; // 멤버 변수, 멤버 필드
	private int second;
	private int result;
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public int add() {
		return first + second;
	}
}
