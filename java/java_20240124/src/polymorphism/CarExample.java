package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 0; i <= 20; i++) {
			int problemTire = car.run();
			switch(problemTire) {
			case 1 : System.out.println(" 왼쪽앞바퀴 금호타이어로 교체 ");
					 car.frontLeftTire =  new KumhoTire("왼쪽앞" , 7);
					 break;
			case 2 : System.out.println(" 왼쪽앞바퀴 금호타이어로 교체 ");
					 car.frontRightTire =  new KumhoTire("오른앞" , 7);
					 break;
			case 3 : System.out.println(" 왼쪽앞바퀴 금호타이어로 교체 ");
					 car.backLeftTire =  new KumhoTire("왼쪽뒤" , 7);
					 break;
			case 4 : System.out.println(" 왼쪽앞바퀴 금호타이어로 교체 ");
					 car.backRightTire =  new KumhoTire("오른쪽" , 7);
					 break;
			}
		}

	}

}
