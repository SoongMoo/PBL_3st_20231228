package approach1;

import approach.MyDate;

public class MyDateChild extends MyDate{
	public void setMonth(int month) {
		this.month = month; // 다른 패키지지만 상속해서 사용가능
	}
	public void setYear(int year) {
		// this.year = year;
	}
}
// private < default < protected < public : 접근지정자. 
