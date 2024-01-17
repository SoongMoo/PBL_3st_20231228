package java_20240117_1;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); //객체
		calculator.first = 10;
		calculator.second = 20;
		calculator.add();
		System.out.println(calculator.result);
		
		Calculator calculator1 = new Calculator();
						// 인자 : 실인자
		                // argument 
		calculator1.setData(10, 20);// 호출메서드
		// 호출함수에 있는 인자의 갯수와
		// 피호출함수에 있는 매개변수의 갯수는
		// 같아야 한다.
		// 인자와 매개변수는 1대1 대응
		// 호메서드의 이름과 피호출메서드의 이름은 같아야 한다.
	}
}
