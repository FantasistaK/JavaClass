package day10_0412;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C=0, N=0;
		double[] sum = null, avg = null, score = null, percent = null;
		C = scan.nextInt();
		
		sum = new double[C]; 
		avg = new double[C];
		percent = new double[C];
		
		double p=0;
		
		for (int i=0;i<C;i++) {
			
			N = scan.nextInt();
			score = new double[N];
						
			for (int j=0;j<N;j++) {
				
				score[j] = scan.nextInt();
				sum[i] += score[j]; 
				
			}
			
			avg[i] = sum[i] / N;
			
			for (int j=0;j<N;j++) {
				
				if(score[j]>avg[i]) {
					percent[i]++;
				}
				
			}
			
			p = percent[i]/N*100;						
			System.out.println(String.format("%.3f",p)+"%");
			
		}
		
	}

}