package java_20240123_polymorphism;

public class Tire { // 다향성
	int maxRotation; // 최대회전 
	int accumulatedRotation; // 현재 회전수
	String location; // 타이어의 위치
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "Tire 수명은 " + 
					accumulatedRotation + "회");
			return true;
		}else {
			System.out.println(location + "Tire 펑크");
			return false;
		}
	}
}
