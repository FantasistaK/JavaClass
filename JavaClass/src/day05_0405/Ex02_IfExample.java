package day05_0405;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		/*
		 * ���� �ٸ� ���� ������ �Է¹޾� ���� ū ���� ����ϱ�
		 * (��, ���� ���ڴ� �Էµ��� �ʴ´ٰ� ����)
		 * �ѹ��� ���� ������ ���ϴ� ���� ���� �ʽ��ϴ�
		 * ��ƴٸ� �ΰ��� �Է¹޾� ū ���ڸ� ����ϴ°� ���� �غ�����
		 * 
		 * ���ܹ���
		 * ���� ū ���� ���� max��� ������ �߰��� �����ؼ�
		 * ū ���ڸ� ����ϴ� print ���� ���ٸ� �Ẹ����
		 */

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max = 0;
		
		System.out.print("ù��° ���ڸ� �Է� �ϼ��� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է� �ϼ��� : ");
		num2 = scan.nextInt();
		System.out.print("����° ���ڸ� �Է� �ϼ��� : ");
		num3 = scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2>num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�");
		
	}

}
