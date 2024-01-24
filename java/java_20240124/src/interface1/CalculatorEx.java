package interface1;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator ex = new Calculator(20, 10);
		ex.print();
		ex.add(10, 20);
		int result = ex.sub();
		System.out.println(result);
		ex.mul();
		Calc.description(); 
		// inteface에 있는 static메서드는  상속 받은 클래스가 아니라
		// inteface명으로 사용
		result = Calc.total(new int[] {1,2,3,4});
		System.out.println(result);
	}
}
