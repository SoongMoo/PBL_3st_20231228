package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("전화 상담 할당 방식을 선택 하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Scheduler scheduler = null;
		switch(str) {
		case "R": case "r": 
			/*RoundRobin roundRobin= new RoundRobin();
			roundRobin.getNextCall();
			roundRobin.sendCallToAgent();*/
			scheduler =  new RoundRobin(); break;
		case "L": case "l": 
			/*LeastJob leastJob = new LeastJob();
			leastJob.getNextCall();
			leastJob.sendCallToAgent();*/
			scheduler = new LeastJob(); break;
		case "P" : case "p" : 
			/*PriorityAllocation priorityAllocation = new PriorityAllocation();
			priorityAllocation.getNextCall();
			priorityAllocation.sendCallToAgent();*/
			scheduler = new PriorityAllocation();
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
