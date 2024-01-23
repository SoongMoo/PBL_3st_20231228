package java_20240123_inheritence;

public class FourCalculatorEx {
	public static void main(String[] args) {
		FourCalculator calc = new FourCalculator(10, 20);
		calc.add();
		FourCalculator1 calc1 = new FourCalculator1(10 ,20);
		calc1.add(); //상속
		calc1.mul(); 
		// 자동 형변환 가능하다.
		Calculator c = new FourCalculator1(10, 20); 
		c.add(); // 부모클래스에 있는 것만 사용이 가능하다.
		// c.mul();
	}
}