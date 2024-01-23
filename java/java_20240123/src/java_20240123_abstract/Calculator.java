package java_20240123_abstract;

public abstract class Calculator { // 상속을 해서 사용
	int first;
	int second;
	int result;
	public Calculator() {}
	public Calculator(int first , int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second;
		System.out.println(result);
	}
	public abstract void div(); // 추상메서드
}
