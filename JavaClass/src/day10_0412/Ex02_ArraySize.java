package day10_0412;

import java.util.Scanner;

public class Ex02_ArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 크기를 스캐너를 통해 지정하기
		
		Scanner scan = new Scanner(System.in);
		int[] num = null;
		
		System.out.print("배열 크기 : ");
		int size = scan.nextInt();
		
		num = new int[size];
		System.out.println("배열 크기 확인");
		System.out.println(num.length);
		
	}

}
