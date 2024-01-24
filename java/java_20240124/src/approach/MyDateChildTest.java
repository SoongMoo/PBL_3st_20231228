package approach;

public class MyDateChildTest {
	public static void main(String[] args) {
		// 같은 패키지 내에서는 어디서 사용가능 protected
		MyDateChild my = new MyDateChild();
		my.month = 12;
		MyDate m = new MyDate();
		m.month = 12;
	}
}
