package day09_0409;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/*
		 * ũ�Ⱑ 3�� ������ �迭�� �����ϰ�
		 * ��ĳ�ʸ� �̿��� �迭�� ���� ������ ����
		 * �Էµ� ���� ����, ����� ����ϼ���.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		int sum = 0;
		double avg = 0;
				
		for (int i=0;i<3;i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		
		System.out.println("���� : "+sum);
		avg = (double)sum/num.length;
		System.out.println("��� : "+avg);

	}

}
