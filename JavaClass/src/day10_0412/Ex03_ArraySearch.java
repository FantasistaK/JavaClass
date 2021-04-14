package day10_0412;

import java.util.Scanner;

public class Ex03_ArraySearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
		int number = 0;
		
		System.out.print("숫자입력 : ");
		number = scan.nextInt();
		
		for (int i=0;i<num.length;i++) {
			if (num[i] == number)
				System.out.println(number+"는 "+i+"번 인덱스에 있습니다.");
		}
		
	}

}