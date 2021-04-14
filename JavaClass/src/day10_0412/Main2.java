package day10_0412;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		int count = 0, count2=0;
		
		for(int i = 0; i < 10; i++) {
			
			num[i] = sc.nextInt();
			
			for(int j=0 ; j<i ; j++) {
				
				if(num[i]%42 != num[j]%42) {
					count++;
				}
				
			}
			
			if(count==i)
				count2++;
			
			count=0;
			
		}
		
		System.out.println(count2);

	}

}
