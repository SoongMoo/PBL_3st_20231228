package polymorphism;

public class Car {
	/*
	Tire frontLeftTire = new HankookTire("앞왼쪽" , 10) ;
	Tire frontRightTire = new HankookTire("앞오른쪽" , 10) ;
	Tire backLeftTire = new HankookTire("뒤왼쪽" , 10) ;
	Tire backRightTire  = new HankookTire("뒤오른쪽" , 10) ;
	*/
	TireAdapter frontLeftTire = new HankookTire("앞왼쪽" , 10) ;
	TireAdapter frontRightTire = new HankookTire("앞오른쪽" , 10) ;
	TireAdapter backLeftTire = new HankookTire("뒤왼쪽" , 10) ;
	TireAdapter backRightTire  = new HankookTire("뒤오른쪽" , 10) ;
	
	public int run() {
		System.out.println("차가 달린다.");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
	
}
