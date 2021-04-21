package day03_0401;

import java.util.Scanner;

public class Ex4_If {

	public static void main(String[] args) {
		/*
		 * 조건문 (if else, switch case)
		 * 
		 * if(condition) {
		 * 		조건이 true면 실행
		 * } else {
		 * 		조건이 false면 실행
		 * }
		 * condition 자리에는 비교연산식, 논리연산식, boolean 변수, T, F 등이 올 수 있음
		 */
		boolean con;
		con = false;
		
		System.out.println("if문 시작");
		if(con) {
			System.out.println("if 부분 실행됨");
		} else {
			System.out.println("else 부분 실행됨");
		}
		System.out.println("if문 끝");
		
		// 스캐너로 정수를 입력받아 if else
		Scanner scan = new Scanner(System.in);
		int num=0;
		System.out.println("숫자 입력 : ");
		num = scan.nextInt();
		// 입력받은 정수가 양수면 양수, 음수면 음수라고 출력(결과 2가지)
		// 0을 입력하면 0이라고 출력하고 싶다..(결과 3가지) 위의 경우에서 조건 추가
		// 조건이 3가지 이상이라면 if else로는 판단 어렵다
		
		if(num>0) {
			
			System.out.println("양수입니다.");
			// 양수여야 이 부분이 실행되기 때문에 여기서 짝수, 홀수를 판단하면 됨.
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
		} else if (num == 0){ // num에 저장된 값이랑 0이랑 비교해서 같으면 true
			
			System.out.println("0 입니다.");
		
		} else {
		
			System.out.println("음수입니다.");
		
		}
		
	}

}