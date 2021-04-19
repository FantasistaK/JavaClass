package day14_0416_03;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int clientNumber = 0;

		List<Bank> clientList = new ArrayList<Bank>();

		do {

			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1. 고객등록(get,set) | 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트 | 6. 종료");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				Bank client = new Bank();
				System.out.print("이름 : ");
				String name = sc.next();
				client.setName(name);
				System.out.print("계좌 : ");
				String accountNumber = sc.next();
				client.setAccountNumber(accountNumber);
				System.out.print("입금액 : ");
				int balance = sc.nextInt();
				client.setBalance(balance);
				clientNumber++;
				client.setClientNumber(clientNumber);

				clientList.add(client);

				break;

			case 2:

				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("계좌 : ");
				accountNumber = sc.next();
				System.out.print("입금액 : ");
				balance = sc.nextInt();
				clientNumber++;

				client = new Bank(clientNumber, name, accountNumber, balance);

				clientList.add(client);

				break;

			case 3:

				System.out.print("계좌 : ");
				accountNumber = sc.next();
				System.out.print("입금액 : ");
				int deposit = sc.nextInt();
				int correct = 0;

				for (int i = 0; i < clientList.size(); i++) {
					if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
						clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
						correct = 1;
					}
				}

				if (correct == 1)
					System.out.println("입금 처리 되었습니다.");
				else
					System.out.println("계좌를 찾을 수 없습니다.");

				break;

			case 4:

				System.out.print("계좌 : ");
				accountNumber = sc.next();
				System.out.print("출금액 : ");
				int output = sc.nextInt();
				correct = 0;

				for (int i = 0; i < clientList.size(); i++) {
					if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
						balance = clientList.get(i).getBalance() - output;
						if (balance >= 0) {
							clientList.get(i).setBalance(balance);
							correct = 1;
						} else {
							correct = 2;
						}
					}
				}

				if (correct == 1)
					System.out.println("출금 처리 되었습니다.");
				else if (correct == 2)
					System.out.println("잔액이 부족합니다.");
				else if (correct == 0)
					System.out.println("계좌를 찾을 수 없습니다.");

				break;

			case 5:

				if (clientList.size() > 0)
					for (int i = 0; i < clientList.size(); i++)
						System.out.println(clientList.get(i));
				else
					System.out.println("고객을 등록해 주세요.");

				break;

			case 6:

				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;

			}

		} while (run);

	}

}