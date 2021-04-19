package day03_0401;

import java.util.Scanner;

public class Ex3_Calculator {

	public static void main(String[] args) {

		int num1=0, num2=0, sum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scan.nextInt();
		
		sum = num1 + num2;
		System.out.println("덧셈 결과는 " + sum + "입니다.");
		System.out.println("덧셈 결과는 " + num1 + num2 + "입니다.");

	}

}
