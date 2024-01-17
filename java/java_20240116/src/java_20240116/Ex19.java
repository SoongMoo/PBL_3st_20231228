package java_20240116;

public class Ex19 {

	public static void main(String[] args) {
		// switch ~ case
		// 남자 : M,  여자 : F
		char gender = 'M';
		if (gender == 'M') { // 크다 작다를 비교할 때 주로 사용
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		switch(gender) { // 비교할 대상이 등호일때 주로 사용
		// if (gender == 'M')
		case 'M': System.out.println("남자"); break;
		// if (gender == 'F')
		case 'F': System.out.println("여자"); break;
		}
		System.out.println("=================");
		switch(gender) { 
		case 'M': System.out.println("남자");
		case 'F': System.out.println("여자"); break; 
		}// break문을 만날 대까지 실행

	}

}
