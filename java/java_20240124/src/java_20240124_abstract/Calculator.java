package java_20240124_abstract;

public abstract class Calculator {
	int first;
	int second;
	int result;
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second; 
	}
	public final void add() { /// override를 하지 못하는 메서드가 됨
		                      /// 템플릿메서드
		result = first + second;
		System.out.println(result);	
	}
	public abstract void div();
}
