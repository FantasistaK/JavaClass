package day05_0405;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		/*
		 * 서로 다른 숫자 세개를 입력받아 가장 큰 숫자 출력하기
		 * (단, 같은 숫자는 입력되지 않는다고 가정)
		 * 한번에 숫자 세개를 비교하는 것은 쉽지 않습니다
		 * 어렵다면 두개를 입력받아 큰 숫자를 출력하는걸 먼저 해보세요
		 * 
		 * 번외문제
		 * 가장 큰 수를 담을 max라는 변수를 추가로 선언해서
		 * 큰 숫자를 출력하는 print 문을 한줄만 써보세요
		 */

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, max = 0;
		
		System.out.print("첫번째 숫자를 입력 하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력 하세요 : ");
		num2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력 하세요 : ");
		num3 = scan.nextInt();
		
		if (num1>num2) {
			if (num1>num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2>num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다");
		
	}

}
