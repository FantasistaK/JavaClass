package day13_0415;

import java.util.Scanner;

public class Cal {
	
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	
	// ���� �޼ҵ�
	void sum (int num1, int num2) {
		
		int sum = num1 + num2;
		System.out.println("��� > "+sum);
		
	}
	
	// ���� �޼ҵ�
	void sub (int num1, int num2) {
		
		int sub = num1 - num2;
		System.out.println("��� > "+sub);
		
	}
	
	// ���� �޼ҵ�
	int mul (int num1, int num2) {
		
		int mul = num1 * num2;
		return mul;
		
	}
	
	// ������ �޼ҵ�
	double div () {
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� > ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� > ");
		int num2 = sc.nextInt();
		
		double div = (double)(num1) / (double)(num2);
		return div;
		
	}
	
}
