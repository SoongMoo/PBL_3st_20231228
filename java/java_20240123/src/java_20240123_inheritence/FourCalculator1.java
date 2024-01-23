package java_20240123_inheritence;
             //자식클래스           //부모클래스
public class FourCalculator1 extends Calculator{
	/*
	 * int first;
	int second;
	int result;
	public Calculator() {}
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void add() {
		result = first + second; 
		System.out.println(result);
	}
	public void div() {
		result = first / second; 
		System.out.println(result);
	}
	 */
	public FourCalculator1(int first, int second) {
		super(first, second);
		System.out.println("자식객체 생성");
	}
	public void sub() {
		result = first - second;
		System.out.println(result);
	}
	public void mul() {
		result = first * second;
		System.out.println(result);
	}
	@Override // 재정의
	public void div() {
		if(second == 0 ) {
			result = 0;
		}else {
			result = first / second;
		}
		System.out.println(result);
	}
	public void superDiv() {
		super.div();
	}
	
}








