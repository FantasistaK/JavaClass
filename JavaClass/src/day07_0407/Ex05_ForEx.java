package day07_0407;

import java.util.Scanner;

public class Ex05_ForEx {

	public static void main(String[] args) {
		// ���� �Է� : 100
		// 1���� 100���� 2,3��� ������ �հ� : 1633
		
		Scanner scan = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("���� �Է� : ");
		num = scan.nextInt();
		// 1. 1���� �Է¹��� ���ڱ��� ����� for
		// 2. ���� �߿��� 2,3�� ����� �ƴ� ���� �ɷ����� if
		// 3. �ɷ��� ���ڵ��� �հ� ���ϱ� sum(������)		
		for (int i=1;i<=num;i++) {
			if ((i%2)!=0) {
				if ((i%3)!=0) {
					sum+=i;
				}
			}
		}
		System.out.println("1���� "+num+"���� 2,3��� ������ �հ� : "+sum);

	}

}
