package java_20240124_abstract1;

public interface CalculatorInterface { // 추상메서드들을 모아둔다.
	final double PI = 3.151; 
	int first = 10; // 멤버변수에 대해서 초기화를 할수없으므로 초기값을 부여
	int second = 20;// 멤버변수는 final키워드를 자동으로 부여되므로 상수가 된다.
	// 생성자를 가질 수 없다.
	public  void add(int num1, int num2); 
	public  void sub(int num1, int num2); 
}
