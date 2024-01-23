package java_20240123_polymorphism;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(maxRotation > accumulatedRotation) {
			System.out.println(location + "금호타이어 수명은 " + 
					accumulatedRotation + "회");
			return true;
		}else {
			System.out.println(location + "금호타이어 펑크");
			return false;
		}
	}
}
