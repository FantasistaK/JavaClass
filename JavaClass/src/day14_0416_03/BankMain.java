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
			System.out.println("1. �����(get,set) | 2. �����(������) | 3. �Ա� | 4. ��� | 5. ������Ʈ | 6. ����");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.print("���� > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				Bank client = new Bank();
				System.out.print("�̸� : ");
				String name = sc.next();
				client.setName(name);
				System.out.print("���� : ");
				String accountNumber = sc.next();
				client.setAccountNumber(accountNumber);
				System.out.print("�Աݾ� : ");
				int balance = sc.nextInt();
				client.setBalance(balance);
				clientNumber++;
				client.setClientNumber(clientNumber);

				clientList.add(client);

				break;

			case 2:

				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("���� : ");
				accountNumber = sc.next();
				System.out.print("�Աݾ� : ");
				balance = sc.nextInt();
				clientNumber++;

				client = new Bank(clientNumber, name, accountNumber, balance);

				clientList.add(client);

				break;

			case 3:

				System.out.print("���� : ");
				accountNumber = sc.next();
				System.out.print("�Աݾ� : ");
				int deposit = sc.nextInt();
				int correct = 0;

				for (int i = 0; i < clientList.size(); i++) {
					if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
						clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
						correct = 1;
					}
				}

				if (correct == 1)
					System.out.println("�Ա� ó�� �Ǿ����ϴ�.");
				else
					System.out.println("���¸� ã�� �� �����ϴ�.");

				break;

			case 4:

				System.out.print("���� : ");
				accountNumber = sc.next();
				System.out.print("��ݾ� : ");
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
					System.out.println("��� ó�� �Ǿ����ϴ�.");
				else if (correct == 2)
					System.out.println("�ܾ��� �����մϴ�.");
				else if (correct == 0)
					System.out.println("���¸� ã�� �� �����ϴ�.");

				break;

			case 5:

				if (clientList.size() > 0)
					for (int i = 0; i < clientList.size(); i++)
						System.out.println(clientList.get(i));
				else
					System.out.println("���� ����� �ּ���.");

				break;

			case 6:

				System.out.println("���α׷��� ���� �մϴ�.");
				run = false;
				break;

			}

		} while (run);

	}

}