package day05_0405;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		/*
		 * 합격 불합격 출력 프로그램(중첩 if문 활용)
		 * 1. 입력값 : 학년, 점수
		 * 2. 출력 조건
		 * 		- 1~3학년은 점수가 60점 이상이어야 합격이라고 출력
		 * 		- 4학년은 70점 이상이어야 합격이라고 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int level=0, score=0;
		System.out.print("학년을 입력하세요 : ");
		level = scan.nextInt();
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		
		if (level >=1 && level <= 3 ) {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else if (level == 4){
			if (score >=70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("다시 입력하세요");
		}
		
	}

}
