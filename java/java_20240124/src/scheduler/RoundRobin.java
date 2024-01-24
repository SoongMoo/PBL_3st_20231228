package scheduler;

/// 순서대로 고객을 가져오는 클래스
public class RoundRobin implements Scheduler{
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	// 1,2,3,4,5 , 3
	// o o x,o,o 
}
