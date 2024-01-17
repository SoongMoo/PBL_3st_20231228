package java_20240116;

public class Ex18 {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		if(age < 8 ) {  // 0 ~ 7
			System.out.println("미 취학 아동입니다.");
			charge = 1000;
		}
		if(age < 14) { //8 ~ 13
			System.out.println("초등학생 입니다.");
			charge = 2000;
		}
		if(age < 20) { // 14 ~ 19
			System.out.println("중, 고등학생 입니다.");
			charge = 2500;
		}else { // 20세 이상
			System.out.println("일반인 입니다.");
			charge = 3000;
		}
		System.out.println("입장료는 " + charge + "원입니다.");
		// 단일 if, if ~ else, if ~ else if ~ else , 중첩 if
	}

}
