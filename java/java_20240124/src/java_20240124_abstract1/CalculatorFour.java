package java_20240124_abstract1;
public class CalculatorFour implements CalculatorInterface, // 다중상속 
									   CalculatorInterface1{
	int result;
	@Override
	public void add(int num1, int num2) {
		// first = 10; interface에 있는 멤버변수는 상수이므로 값을 변경할 수 없다.
		System.out.println(first + second);
		result = num1 + num2;
	}
	@Override
	public void sub(int num1, int num2) {

	}

	@Override
	public void mul(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

}
