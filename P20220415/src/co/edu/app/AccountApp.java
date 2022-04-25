package co.edu.app;

import java.util.Arrays;
import java.util.Scanner;

public class AccountApp {
	
	Scanner scn = new Scanner(System.in);
	Account[] accounts = new Account[100];	//계좌번호를 정장하기 위한 배열
	
	public void execute() {
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>> ");
			
			int menu = scn.nextInt();
			scn.nextLine();
			
			if(menu == 1) {
				createAccount();
			}else if(menu == 2) {
				accountList();
			}else if(menu == 3) {
				deposit();
			}else if(menu == 4) {
				withdraw();
			}else if(menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	//계좌생성 시 실행 메소드
	public void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호 : ");
		String aNumber = scn.nextLine();
		System.out.print("계좌주 : ");
		String aUsers = scn.nextLine();
		System.out.print("초기입금액 : ");
		int aBalance = Integer.parseInt(scn.nextLine());
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		Account newAccount = new Account(aNumber, aUsers, aBalance);
		for(int i=0; i<accounts.length; i++) {	//내 계좌
			if(accounts[i] == null) {
				accounts[i] = newAccount;
				break;
			}
		}
		
	}
	

	//전체목록 실행 메소드
	public void accountList() {
			System.out.println("-----------");
			System.out.println("계좌목록");
			System.out.println("-----------");
			
			for(Account account : accounts) {
				if(account != null) {
					account.getInfo();
				}
			}
	}
	
	//입금처리 시 실행 메소드
	public void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.println("계좌번호>> ");
		String iaccNumber = scn.nextLine();
		

		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				System.out.println("입력한 계좌번호가 없습니다.");
				break;
			}
			if (accounts[i].getAccNumber().equals(iaccNumber) && accounts[i] != null) {
				System.out.println("예금액>> ");
				int ideposit = scn.nextInt();
				accounts[i].setAccBalance(accounts[i].getAccBalance() + ideposit);
				System.out.println("정상적으로 처리되었습니다.");
				break;
			} else {
				System.out.println("계좌번호가 다릅니다.");
			}
		}
	}
	
	//출금처리 시 실행 메소드
	public void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.println("계좌번호>> ");
		String maccNumber = scn.nextLine();
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] == null) {
				System.out.println("입력한 계좌번호가 없습니다.");
				break;
			}
			if (accounts[i].getAccNumber().equals(maccNumber) && accounts[i] != null) {
				System.out.println("출금액>> ");
				int mdeposit = scn.nextInt();
				accounts[i].setAccBalance(accounts[i].getAccBalance() - mdeposit);
				System.out.println("정상적으로 처리되었습니다.");
				break;
			} else {
				System.out.println("계좌번호가 다릅니다.");
			}
		}
		
	}
	
	

}
