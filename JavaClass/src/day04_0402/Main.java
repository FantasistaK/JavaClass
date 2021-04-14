package day04_0402;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int H, M;
        Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		M = scan.nextInt();
				
		int time;
		time = H*60+M-45;
		
		if (time>=0) {
			System.out.print((time/60) + " " + (time%60));
		} else {
			time+=1440;
			System.out.print((time/60) + " " + (time%60));
		}		
	}
}