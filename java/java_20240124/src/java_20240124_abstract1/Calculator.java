package java_20240124_abstract1;

public abstract class Calculator {
	public abstract void add(int first, int second); 
	public abstract void sub(int first, int second); 
	public abstract void mul(int first, int second); 
	public abstract void div(int first, int second);
	
	public final void  description() { // 일반 메서드
		System.out.println("정수 계산기를 구현합니다");
	}
}
