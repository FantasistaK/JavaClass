package day05_0405;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		/*
		 * �հ� ���հ� ��� ���α׷�(��ø if�� Ȱ��)
		 * 1. �Է°� : �г�, ����
		 * 2. ��� ����
		 * 		- 1~3�г��� ������ 60�� �̻��̾�� �հ��̶�� ���
		 * 		- 4�г��� 70�� �̻��̾�� �հ��̶�� ���
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int level=0, score=0;
		System.out.print("�г��� �Է��ϼ��� : ");
		level = scan.nextInt();
		System.out.print("������ �Է��ϼ��� : ");
		score = scan.nextInt();
		
		if (level >=1 && level <= 3 ) {
			if (score >= 60) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else if (level == 4){
			if (score >=70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else {
			System.out.println("�ٽ� �Է��ϼ���");
		}
		
	}

}
