package day09_0409;

import java.util.Scanner;

public class Ex03_ArrayMax {

	public static void main(String[] args) {
		/*
		 * ũ�Ⱑ 5�� ������ �迭�� ��ĳ�ʷ� ���� �Է¹޾�
		 * �Էµ� �� �߿��� ���� ū �� ����ϱ�
		 * {3, 1, 5, 2, 4}
		 */
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0;
		
		for (int i=0;i<num.length;i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
			num[i]=scan.nextInt();
			if (max<num[i])
				max = num[i];
		}
		System.out.println("�ִ밪�� "+max+"�Դϴ�.");
		
	}

}
