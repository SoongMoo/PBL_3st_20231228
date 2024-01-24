package interface1;

public interface Calc {
	final double PI = 3.151592; // 상수
	int ERROR = 99999; // 상수
	void add(int num1, int num2); // 추상메서드
	int sub(); // 접근 지정자 : private, protected,default,public
	           // 기본접근지정자 : default
	public void mul();
	default void print() {
		System.out.println("디펄트 메서드");
	}
	static void description() {
		System.out.println("정적 메서드");
	}
	static int total(int [] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
}
