package day04_0402;

import java.util.Scanner;

public class Ex3_35Times {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();

		if (num > 0) {

			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("공배수 입니다.");
			} else if (num % 3 == 0) {
				System.out.println("3의 배수 입니다.");
			} else if (num % 5 == 0) {
				System.out.println("5의 배수 입니다.");
			} else {
				System.out.println("3의 배수, 5의 배수가 아닙니다.");
			}

		} else {

			System.out.println("양수를 입력하세요");

		}

	}

}
