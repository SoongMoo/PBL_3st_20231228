package java_20240116;

public class Ex15 {

	public static void main(String[] args) {
		int age = 7;
		if(age >= 8) { // true
			System.out.println("학교를 다닙니다.");
		}else { // false일 때 실행
			System.out.println("학교를 다니지 않습니다.");
		}
		int money = 3000;
		if(money >= 3500) { // if ~ else문
			System.out.println("택시를 타고가세요.");
		}else {
			System.out.println("걸어가시오.");
		}
		char gender = 'F';
		if (gender == 'M') {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		// 4년마다 윤년이고 100년마다는 윤년이 아니고, 
		// 400마다는 윤년이다 그렇다념 2100년은?
		int year = 2100;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		int mat, eng, kor;
		mat = 40;
		eng = 60;
		kor = 80;
		//이때 각 과목의 점수는 40이상이어야 하며 평균은 60점이상 이어야 한다.
		//조건에 만족하면 합격 아니면 불합격
		if (mat >= 40 && eng >= 40 && kor >= 40 && (mat+eng+kor)/3 >=60){
		    System.out.println("합격입니다.");
		}else{
		    System.out.println("불합격입니다.");
		}
	}

}
