package java_20240122_account;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Account [] accountArray = new Account[100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 > ");
			int selectNo = sc.nextInt();
			switch(selectNo) {
			case 1 : createAccount(); break;
			case 2 : accountList(); break;
			case 3 : deposit(); break;
			case 4 : withdraw() ; break;
			case 5 : run = false;
			}
		}	
	}
	public static void createAccount() {}
	public static void accountList() {}
	public static void deposit() {}
	public static void  withdraw() {}
}
