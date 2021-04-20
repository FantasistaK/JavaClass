package day14_0416_03;

import java.util.*;

// Service 클래스 : 처리를 담당하는 클래스(비즈니스 클래스)
public class BankService {

	Scanner sc = new Scanner(System.in);
	
	// 입금처리를 위한 메소드 선언
	/*
	 * 메소드 이름 : deposit
	 * 매개변수 : clientList
	 * 리턴 : clientList
	 * (Main Class가 가장 최신의 데이터를 가져야하기 때문)
	 */
	
	List<BankDTO> Deposit(List<BankDTO> clientList) {
		
		System.out.print("계좌 : ");
		String accountNumber = sc.next();
		System.out.print("입금액 : ");
		int deposit = sc.nextInt();
		int process = 0;
		
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
				process = 1;
			}
		}
		
		if (process == 1)
			System.out.println("입금 처리 되었습니다.");
		else
			System.out.println("계좌를 찾을 수 없습니다.");
				
		return clientList;
		
	}

	// 출금처리를 위한 메소드 선언
	/*
	 * 메소드 이름 : withdraw
	 * 매개변수 : clientList
	 * 리턴 : clientList
	 */
	
	List<BankDTO> Withdraw(List<BankDTO> clientList) {
		
		System.out.print("계좌 : ");
		String accountNumber = sc.next();
		System.out.print("출금액 : ");
		int withdraw = sc.nextInt();
		int process = 0;

		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				int balance = clientList.get(i).getBalance() - withdraw;
				if (balance >= 0) {
					clientList.get(i).setBalance(balance);
					process = 1;
				} else {
					process = 2;
				}
			}
		}
		
		if (process == 1)
			System.out.println("출금 처리 되었습니다.");
		else if (process == 2)
			System.out.println("잔액이 부족합니다.");
		else
			System.out.println("계좌를 찾을 수 없습니다.");
		
		return clientList;
		
	}
	
}
