package day13_0415;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num1 = 0, num2 = 0;
		
		while (run) {
		
			System.out.println("---------------------------------------------");
			System.out.println(" 1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			Cal cal = new Cal();
			
			switch (select) {
			
			case 1:
				
				cal.sum(3, 5);
				break;
				
			case 2:
				
				System.out.print("첫번째 숫자를 입력하세요 > ");
				num1 = sc.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				num2 = sc.nextInt();
				
				cal.sub(num1, num2);
				break;
				
			case 3:
				
				System.out.print("첫번째 숫자를 입력하세요 > ");
				num1 = sc.nextInt();
				System.out.print("두번째 숫자를 입력하세요 > ");
				num2 = sc.nextInt();
				
				System.out.println("결과 > "+cal.mul(num1, num2));
				break;
				
			case 4:
				
				System.out.println("결과 > "+cal.div());
				break;
				
			case 5:
				
				System.out.println("계산기를 종료합니다.");
				run = false;
				break;
			
			}
		
		}
			
	}

}