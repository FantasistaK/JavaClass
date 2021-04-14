package day08_0408;

import java.util.Scanner;

public class Ex04_While_CountSum {

	public static void main(String[] args) {
		/*
		 * 임의의 정수를 여러 개 입력한 뒤 마지막에 0을 입력하면 
		 * 입력된 정수의 갯수와 평균값을 출력하는 프로그램
		 * 숫자를 하나 입력하고 엔터를 치면
		 * 	- 반복문이 1번 실행된다는 것
		 *  - 그리고 입력된 숫자를 더해야 하고
		 *  - 횟수도 하나 올려야함.
		 *  - 0이 입력되면 반복문 종료 하고 계산결과와 횟수 출력
		 */

		Scanner scan = new Scanner(System.in);

		int n = 0, num = 0, sum = 0, avg = 0;
		boolean run = true;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

		do {
			num = scan.nextInt();
			sum += num;
			if (num == 0)
				run = false;
			else
				n++;
		} while (run);

		avg = sum / n;

		System.out.println("입력한 수는 " + n + "개");
		System.out.println("평균은 " + avg + "입니다.");
	}
}
