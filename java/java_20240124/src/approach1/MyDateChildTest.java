package approach1;

import approach.MyDate;

public class MyDateChildTest {
	public static void main(String args) {
		MyDate my = new MyDate();
		// my.month = 12; // protected는 다른 패키지인 경우 접근하지 못함.
		MyDateChild mm = new MyDateChild();
		// mm.month = 12; // protected는 다른 패키지인 경우 접근하지 못함
	}
}
