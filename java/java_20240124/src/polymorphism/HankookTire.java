package polymorphism;

public class HankookTire /*extends Tire*/ implements TireAdapter {
	int maxRotation;
	int accumulatedRotation;
	String location;
	public HankookTire(String location ,int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "한국타이어 수명 : " + accumulatedRotation + "회");
			return true; // 정상
		}else { // 교체시기
			System.out.println("***" + location + "한국타이어 펑크 ***");
			return false;
		}
	}

}
