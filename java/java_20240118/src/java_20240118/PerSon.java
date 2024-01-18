package java_20240118;

public class PerSon {
	String name;
	String age;
	String height;
	public PerSon() {}
	public PerSon(String name, String age, String height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
