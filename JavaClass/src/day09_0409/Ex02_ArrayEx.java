package day09_0409;

import java.util.Scanner;

public class Ex02_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 크기가 3인 정수형 배열을 선언하고
		 * 스캐너를 이용해 배열에 값을 저장한 다음
		 * 입력된 값의 총합, 평균을 계산하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		int sum = 0;
		double avg = 0;
				
		for (int i=0;i<3;i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
		
		System.out.println("총합 : "+sum);
		avg = (double)sum/num.length;
		System.out.println("평균 : "+avg);

	}

}