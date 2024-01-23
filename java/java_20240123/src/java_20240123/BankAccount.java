package java_20240123;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
	//static int index = 0;
	//static Account [] account = new Account[100];
	static ArrayList<Account> account = new  ArrayList<Account>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {	
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			int selectNum = sc.nextInt();
			switch(selectNum) {
			case 1 :
				createAccount(); break;
			case 2 : accountList(); break;
			case 3 : deposit(); break;
			case 4 : withdraw(); break;
			case 5 : run = false; 
					 System.out.println("프로그램이 종료되었습니다.");
					 break;
			}
		}
	}
	public static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		int ano = sc.nextInt();   
		sc.nextLine();
		System.out.print("계좌주 : "); 
		String owner = sc.nextLine();
		System.out.println("초기입금금액 : ");
		int balance = sc.nextInt();
		Account acc = new Account(ano,owner,balance);
		//account[index++] = acc;
		account.add(acc);
	}
	public static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for(Account acc : account) {
			if(acc == null) break;
			System.out.println(acc.getAno() + "\t" + acc.getOwner() +"\t"+acc.getBalace());
		}
	}
	public static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호 : ");
		int ano  = sc.nextInt();
		System.out.print("예금액");
		int money = sc.nextInt();
		for(Account acc :  account) {
			if (acc == null) break;
			if (acc.getAno() == ano) {
				acc.setBalance(acc.getBalace() + money);
			}
		}
	}
	public static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호 : ");
		int ano  = sc.nextInt();
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		for(Account acc :  account) {
			if (acc == null) break;
			if (acc.getAno() == ano) {
				acc.setBalance(acc.getBalace() - money);
			}
		}
	}
}




