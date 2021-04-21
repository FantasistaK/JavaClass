package day13_0415;

import java.util.Scanner;

public class Cal {
	
	Scanner sc = new Scanner(System.in);
	int num1, num2;
	
	// 덧셈 메소드
	void sum (int num1, int num2) {
		
		int sum = num1 + num2;
		System.out.println("결과 > "+sum);
		
	}
	
	// 뺄셈 메소드
	void sub (int num1, int num2) {
		
		int sub = num1 - num2;
		System.out.println("결과 > "+sub);
		
	}
	
	// 곱셈 메소드
	int mul (int num1, int num2) {
		
		int mul = num1 * num2;
		return mul;
		
	}
	
	// 나눗셈 메소드
	double div () {
		
		System.out.print("첫번째 숫자를 입력하세요 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 > ");
		int num2 = sc.nextInt();
		
		double div = (double)(num1) / (double)(num2);
		return div;
		
	}
	
}