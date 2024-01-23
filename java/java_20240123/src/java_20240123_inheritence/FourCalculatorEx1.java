package java_20240123_inheritence;

public class FourCalculatorEx1 {

	public static void main(String[] args) {
		FourCalculator1 calc = new FourCalculator1(0, 10); // 상속받은 클래스
		calc.add(); // 0 + 10
		calc.mul(); // 0 * 20
		calc.div(); // 0 / 10 = 0 : 부정
		FourCalculator1 calc1 = new FourCalculator1(10, 0); // 상속받은 클래스
		calc1.add(); // 10 + 0 = 10
		calc1.mul(); // 10 * 0 = 0
		calc1.div(); // 10 / 0 = ? : 불능
		calc1.superDiv(); // 부모클래스에 있는 메서드 실행
	}

}
