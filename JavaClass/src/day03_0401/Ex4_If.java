package day03_0401;

import java.util.Scanner;

public class Ex4_If {

	public static void main(String[] args) {
		/*
		 * ���ǹ� (if else, switch case)
		 * 
		 * if(condition) {
		 * 		������ true�� ����
		 * } else {
		 * 		������ false�� ����
		 * }
		 * condition �ڸ����� �񱳿����, �������, boolean ����, T, F ���� �� �� ����
		 */
		boolean con;
		con = false;
		
		System.out.println("if�� ����");
		if(con) {
			System.out.println("if �κ� �����");
		} else {
			System.out.println("else �κ� �����");
		}
		System.out.println("if�� ��");
		
		// ��ĳ�ʷ� ������ �Է¹޾� if else
		Scanner scan = new Scanner(System.in);
		int num=0;
		System.out.println("���� �Է� : ");
		num = scan.nextInt();
		// �Է¹��� ������ ����� ���, ������ ������� ���(��� 2����)
		// 0�� �Է��ϸ� 0�̶�� ����ϰ� �ʹ�..(��� 3����) ���� ��쿡�� ���� �߰�
		// ������ 3���� �̻��̶�� if else�δ� �Ǵ� ��ƴ�
		
		if(num>0) {
			
			System.out.println("����Դϴ�.");
			// ������� �� �κ��� ����Ǳ� ������ ���⼭ ¦��, Ȧ���� �Ǵ��ϸ� ��.
			if (num % 2 == 0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
			
		} else if (num == 0){ // num�� ����� ���̶� 0�̶� ���ؼ� ������ true
			
			System.out.println("0 �Դϴ�.");
		
		} else {
		
			System.out.println("�����Դϴ�.");
		
		}
		
		
	}

}
