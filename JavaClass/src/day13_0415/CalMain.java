package day13_0415;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num1 = 0, num2 = 0;
		
		while (run) {
		
			System.out.println("---------------------------------------------");
			System.out.println(" 1. ���� | 2. ���� | 3. ���� | 4. ������ | 5. ����");
			System.out.println("---------------------------------------------");
			System.out.print("���� > ");
			int select = sc.nextInt();
			
			Cal cal = new Cal();
			
			switch (select) {
			
			case 1:
				
				cal.sum(3, 5);
				break;
				
			case 2:
				
				System.out.print("ù��° ���ڸ� �Է��ϼ��� > ");
				num1 = sc.nextInt();
				System.out.print("�ι�° ���ڸ� �Է��ϼ��� > ");
				num2 = sc.nextInt();
				
				cal.sub(num1, num2);
				break;
				
			case 3:
				
				System.out.print("ù��° ���ڸ� �Է��ϼ��� > ");
				num1 = sc.nextInt();
				System.out.print("�ι�° ���ڸ� �Է��ϼ��� > ");
				num2 = sc.nextInt();
				
				System.out.println("��� > "+cal.mul(num1, num2));
				break;
				
			case 4:
				
				System.out.println("��� > "+cal.div());
				break;
				
			case 5:
				
				System.out.println("���⸦ �����մϴ�.");
				run = false;
				break;
			
			}
		
		}
		
				
	}

}
