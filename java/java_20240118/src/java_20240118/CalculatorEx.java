package java_20240118;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//calc.first = 10;
		//calc.second = 20;
		calc.setData(10, 20);
		int i = calc.add();
		System.out.println(i);
		
		Calculator calc1 = new Calculator();
		calc1.setData(20, 40);
		i = calc1.add();
		System.out.println(i);

	}

}
