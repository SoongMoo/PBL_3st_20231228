package java_20240124_inheritance;

public class C extends B {
	@Override
	public void add(int first, int second) {
		System.out.println(first + second + 10);
	}
	public void parentsAdd(int first, int second) {
		super.add(first, second);
	}
	public void mul(int first, int second) {
		System.out.println(first * second);
	}
}
