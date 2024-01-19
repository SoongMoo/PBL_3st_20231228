package java_20240119_1;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	public Bus(int passengerCount, int busNumber) {
		this.passengerCount = passengerCount;
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;		passengerCount ++;
	}
	public void showInfo() {
		System.out.println(busNumber + "번이고 " +
	                       "승객의 수는 " + passengerCount + 
	                       "이며 수입은 " + money); 
	}
	
}
