package day14_0416_03;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int clientNumber = 0;

		List<BankDTO> clientList = new ArrayList<BankDTO>();

		do {

			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("1. 고객등록(get,set) | 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트 | 6. 종료");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				BankDTO client = new BankDTO();
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

				client = new BankDTO(clientNumber, name, accountNumber, balance);

				clientList.add(client);

				break;

			case 3:

				BankService bs = new BankService();
				
				clientList = bs.Deposit(clientList);
				
				break;

			case 4:

				bs = new BankService();
				
				clientList = bs.Withdraw(clientList);
								
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
		
		sc.close();
		
	}

}