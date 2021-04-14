package day06_0406;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A,B,V;
		A=scan.nextInt();
		B=scan.nextInt();
		V=scan.nextInt();
		
		int sum=0, n=1;
		
		while (sum<V) {
			
			sum+=A;
					
			if (sum>=V) {
				break;
			}
			
			sum-=B;
			n++;
			
		}
		System.out.println(n);
		
	}

}
