package java_20240123_polymorphism;

public class Car {
	// 다향성
	Tire frontLeftTire =  new HankookTire("앞왼쪽", 6);
	Tire frontRightTire = new HankookTire("앞오른쪽", 5);
	Tire backLeftTire = new HankookTire("뒤왼쪽", 5);
	Tire backRightTire = new HankookTire("뒤오른쪽", 5);;
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) return 1;
		if(frontRightTire.roll() == false) return 2;
		if(backLeftTire.roll() == false) return 3;
		if(backRightTire.roll() == false) return 4;
		return 0; 
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
