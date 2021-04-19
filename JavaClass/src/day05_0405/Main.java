package day05_0405;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=0, x=0;
		n = scan.nextInt();
		x = scan.nextInt();
		int[] aGroup = new int[n];
		for(int i=0; i<n; i++) {
			aGroup[i] = scan.nextInt();
		}
		for(int j=0; j<n; j++) {
			if (aGroup[j]<x) {
				System.out.print(aGroup[j]+" ");
			}
		}
	}
}
