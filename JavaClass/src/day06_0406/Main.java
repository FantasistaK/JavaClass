package day06_0406;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, cycle = 0, sum = 0, l = 0, r = 0;
		num = scan.nextInt();
		sum = num;
		while (true) {
			if (sum < 10) {
				l = 0;
				r = sum;
				sum = (r * 10) + ((l + r) % 10);
			} else {
				l = sum / 10;
				r = sum % 10;
				sum = (r * 10) + ((l + r) % 10);
			}
			cycle++;
			if (num == sum) {
				break;
			}
		}
		System.out.println(cycle);
	}
}
