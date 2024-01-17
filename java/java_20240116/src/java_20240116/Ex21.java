package java_20240116;

public class Ex21 {
	public static void main(String[] args) {
		// 3월 4월 5월은 "봄입니다."
		// 6월 7월 8월은 "여름입니다."
		// 9월 10월 11월은 "가을입니다."
		// 12월 1월 2월은 "겨울입니다."
		// 이외의 숫자는 "날짜가 잘못되었습니다."
		// if ~  else if ~ else문과 switch~case문 두개를 사용할 것
		int month = 12;
		if(month >= 3 && month <= 5) {
			System.out.println("봄입니다");
		}else if(month >= 6 && month <= 8) {
			System.out.println("여름입니다");
		}else if(month >= 7 && month <= 11) {
			System.out.println("가을입니다");
		}else if(month == 12 || month >= 1 && month <= 2 ) {
			System.out.println("겨울입니다");
		}else {
			System.out.println("날짜가 잘못되었습니다.");
		}
		switch (month) {
		case 3:case 4:
		case 5:System.out.println("봄입니다");  break;
		case 6:case 7:
		case 8:System.out.println("여름입니다");  break;
		case 9:case 10:
		case 11:System.out.println("가을입니다");  break;
		case 12:case 1:
		case 2:System.out.println("겨울입니다");  break;
		default :System.out.println("날짜가 잘못되었습니다.");
		}
	}

}
