package java_20240118;

public class PerSonEx {
	public static void main(String[] args) {
		PerSon p1 = new PerSon(); // 기본생성자 
		// 객체생성시에는 항상 생성자를 실행시킨다.
		// 생성자의 역할 : 멤버변수를 초기화하기 위해서 사용\
		PerSon p2 = new PerSon("이숭무", "35", "176.2");
		p2.print();
	}
}