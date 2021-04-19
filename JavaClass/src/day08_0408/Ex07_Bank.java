package day08_0408;

import java.util.Scanner;

public class Ex07_Bank {

	public static void main(String[] args) {
		/*
		 * �Ա�, ���, �ܾ���ȸ ��ɸ� ����
		 * �ʱ� �ܾ��� 0
		 * �ܰ� ���� ������ �ʿ���. (�Ա�, ��ݽ� �ܰ� ���� ���� �ٲ��� ��.)
		 * 
		 * 1�б� 15�� 16�� 3~4�ð�
		 * 45, 60 48~64
		 * 12�� 36, 48 64
		 * ����
		 * ���ǹ� (if, if else, if elseif else, switch case)
		 * �ݺ��� (for, while, do while)
		 * ��ø if, ��ø for
		 * 
		 * ���α׷� ���� ���μ���
		 * �䱸����(���, ���, �Է�)
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int choice = 0, in = 0, out = 0, sum = 0;
		
		do {
			
			System.out.println("---------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			choice = scan.nextInt();
			
			switch (choice) {
			
				case 1:
					System.out.print("���ݾ�> ");
					in = scan.nextInt();
					if(in>0) {
						sum += in;
						System.out.println("�Ա� ó�� �Ǿ����ϴ�.");
						System.out.println("���� �ܾ��� "+sum+"�� �Դϴ�.");
					} else {
						System.out.println("�ٽ� �Է��� �ּ���.");
					}
					System.out.println();
					break;
				
				case 2:
					System.out.print("��ݾ�> ");
					out = scan.nextInt();
					if (out>sum) {
						System.out.println("�ܾ��� �����մϴ�.");
						System.out.println("���� �ܾ��� "+sum+"�� �Դϴ�.");
					} else {
						sum -= out;
						System.out.println("��� ó�� �Ǿ����ϴ�.");
						System.out.println("���� �ܾ��� "+sum+"�� �Դϴ�.");
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("���� �ܾ��� "+sum+"�� �Դϴ�.");
					System.out.println();
					break;
					
				case 4:
					run = false;
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					break;
					
				default:
					System.out.println("�ٽ� �Է��� �ּ���.");
					System.out.println();
					break;
					
			}
			
		} while (run);

	}

}
