package day04_0402;

import java.util.Scanner;

public class Ex2_EvenOdd {

	public static void main(String[] args) {
		/*
		 * 홀수, 짝수 판별 프로그램
		 * 음수, 0을 입력하면 0보다 큰 수를 입력해주세요 출력
		 * 
		 *  첫번째 조건 : 양수
		 *  양수면 홀수인지 짝수인지 판별
		 */
		
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.print("숫자를 입력하세요 : ");
		num1 = scan.nextInt();
		num2 = num1 % 2;

		if (num1 > 0) {
			if (num2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}

	}

}