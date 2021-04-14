package day08_0408;

import java.util.Scanner;

public class Ex07_Bank {

	public static void main(String[] args) {
		/*
		 * 입금, 출금, 잔액조회 기능만 있음.
		 * 초기 잔액은 0
		 */

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int choice = 0, in = 0, out = 0, sum = 0;
		
		do {
			
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			choice = scan.nextInt();
			
			switch(choice) {
				
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
					if(out>sum) {
						System.out.println("잔액이 부족합니다.");
						System.out.println("현재 잔액은 "+sum+"원 입니다.");
					} else {
						System.out.println("출금 처리 되었습니다.");
						sum -= out;
						System.out.println("현재 잔액은 "+sum+"원 입니다.");
					}
					System.out.println();
					break;
				
				case 3:
					System.out.println("현재 잔액은 "+sum+"원 입니다.");
					System.out.println();
					break;
				
				case 4:
					System.out.println("프로그램이 종료되었습니다.");
					run=false;
					break;
				
				default :
					System.out.println("다시 입력해 주세요");
					System.out.println();
					break;
					
			}
			
		} while(run);
		
	}

}
