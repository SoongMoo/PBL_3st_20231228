package polymorphism;

public class KumhoTire /*extends Tire*/ implements TireAdapter {// 다향성
	int maxRotation;
	int accumulatedRotation;
	String location;
	public KumhoTire(String location ,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "금호타이어 수명 : " + accumulatedRotation + "회");
			return true; // 정상
		}else { // 교체시기
			System.out.println("***" + location + "금호타이어 펑크 ***");
			return false;
		}
	}
}
