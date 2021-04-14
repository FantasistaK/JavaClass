package day04_0402;

import java.util.Scanner;
public class gugudan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		num = scan.nextInt();
		for (int i=num; i>0; i--) {
			System.out.println(i);
		}
	}
}
