package day14_0416_03;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int clientNumber=0;
		
		Bank b1 = new Bank();
		
		List<Bank> clientList = new ArrayList<Bank>();
		
		
		do {
		
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1. 고객등록(get,set) | 2. 고객등록(생성자) | 3. 입금 | 4. 출금 | 5. 고객리스트 | 6. 종료");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch (select) {
			
			case 1:
				
				System.out.print("이름 : ");
				String name = sc.next();
				b1.setName(name);
				System.out.print("계좌 : ");
				String accountNumber = sc.next();
				b1.setAccountNumber(accountNumber);
				System.out.print("입금액 : ");
				int balance = sc.nextInt();
				b1.setBalance(balance);
				clientNumber++;
				b1.setClientNumber(clientNumber);
				
				clientList.add(b1);
				
				break;
			
			case 2:
				
				System.out.print("이름 : ");
				String name2 = sc.next();
				System.out.print("계좌 : ");
				String accountNumber2 = sc.next();
				System.out.print("입금액 : ");
				int balance2 = sc.nextInt();
				clientNumber++;
				
				Bank b2 = new Bank(clientNumber, name2, accountNumber2, balance2);
				
				clientList.add(b2);
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				for(int i = 0; i < clientList.size(); i++)
					System.out.println(clientList.get(i));
				
				break;
			
			case 6:
				
				run = false;
				break;
				
			}

		
		} while(run);
		
		
		
	}

}
