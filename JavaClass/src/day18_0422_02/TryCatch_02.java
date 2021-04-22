package day18_0422_02;

import java.util.Scanner;

public class TryCatch_02 {

	public static void main(String[] args) {
		// 나눗셈을 할 떄
		// a/b에서 b가 0이면 발생하는 예외를 확인하고
		// 예외처리를 할 수 있는 코드를 작성해보세요.
		// 예외가 발생하는 경우 "0으로 나눌 수 없습니다."를 출력
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("a : ");
			int a = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
			System.out.println("a/b : "+(a/b));				
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("다른 예외 ");
		}

	}

}
