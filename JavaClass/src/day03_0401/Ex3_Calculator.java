package day03_0401;

import java.util.Scanner;

public class Ex3_Calculator {

	public static void main(String[] args) {

		int num1=0, num2=0, sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		num2 = scan.nextInt();
		
		sum = num1 + num2;
		System.out.println("���� ����� " + sum + "�Դϴ�.");
		System.out.println("���� ����� " + num1 + num2 + "�Դϴ�.");

	}

}
