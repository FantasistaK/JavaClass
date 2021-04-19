package day08_0408;

import java.util.Scanner;

public class Ex07_Bank {

	public static void main(String[] args) {
		/*
		 * 입금, 출금, 잔액조회 기능만 있음
		 * 초기 잔액은 0
		 * 잔고를 위한 변수가 필요함. (입금, 출금시 잔고 변수 값이 바뀌어야 함.)
		 * 
		 * 1학기 15주 16주 3~4시간
		 * 45, 60 48~64
		 * 12주 36, 48 64
		 * 변수
		 * 조건문 (if, if else, if elseif else, switch case)
		 * 반복문 (for, while, do while)
		 * 중첩 if, 중첩 for
		 * 
		 * 프로그램 개발 프로세스
		 * 요구사항(결과, 기능, 입력)
		 */
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int choice = 0, in = 0, out = 0, sum = 0;
		
		do {
			
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			choice = scan.nextInt();
			
			switch (choice) {
			
				case 1:
					System.out.print("예금액> ");
					in = scan.nextInt();
					if(in>0) {
						sum += in;
						System.out.println("입금 처리 되었습니다.");
						System.out.println("현재 잔액은 "+sum+"원 입니다.");
					} else {
						System.out.println("다시 입력해 주세요.");
					}
					System.out.println();
					break;
				
				case 2:
					System.out.print("출금액> ");
					out = scan.nextInt();
					if (out>sum) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("현재 잔액은 "+sum+"원 입니다.");
					} else {
						sum -= out;
						System.out.println("출금 처리 되었습니다.");
						System.out.println("현재 잔액은 "+sum+"원 입니다.");
					}
					System.out.println();
					break;
					
				case 3:
					System.out.println("현재 잔액은 "+sum+"원 입니다.");
					System.out.println();
					break;
					
				case 4:
					run = false;
					System.out.println("프로그램이 종료되었습니다.");
					break;
					
				default:
					System.out.println("다시 입력해 주세요.");
					System.out.println();
					break;
					
			}
			
		} while (run);

	}

}
