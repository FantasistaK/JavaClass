package day04_0402;

import java.util.Scanner;

public class Ex1_IfExample {

	public static void main(String[] args) {

		int score = 0;
		String grade = "";
		/* 변수를 선언할 때 초기값을 되도록이면 주자
		 * int var1 = 0;
		 * double var2 = 0.0;
		 * boolean var3 = false;
		 * String var4 = "";
		*/

		Scanner scan = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();

		if (score <= 100 && score >= 0) {

			if (score >= 95) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			} else if (score >= 85) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 75) {
				grade = "C+";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 65) {
				grade = "D+";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}

			System.out.println("당신의 학점은 " + grade + "입니다.");

		} else {

			System.out.println("입력범위 초과!!");

		}
		// ctrl+shift+f = 자동줄맞춤
	}

}
