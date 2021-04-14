package day06_0406;

import java.util.Scanner;

public class Ex05_ForSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int start=0, end=0, sum=0;
		
		System.out.print("시작값을 입력하세요 : ");
		start=scan.nextInt();
		System.out.print("끝값을 입력하세요 : ");
		end=scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			sum += i;
			System.out.print(i);
			
			if(i<end) {
				System.out.print("+");
			} else {
				System.out.print("=");				
			}
			
		}
		
		System.out.println(sum);
		
		System.out.println(start+"부터 "+end+"까지의 합은 "+sum+"입니다.");
		
	}
	
}
