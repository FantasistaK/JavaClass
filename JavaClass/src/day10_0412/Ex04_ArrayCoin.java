package day10_0412;

import java.util.Scanner;

public class Ex04_ArrayCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 500, 100, 50, 10 };
		// 거스름돈 계산하기

		Scanner sc = new Scanner(System.in);

		System.out.print("금액 입력 : ");
		int money = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {

			int coinCount = money / coin[i];
			System.out.println(coin[i] + "원 동전 : " + coinCount + "개");
			money %= coin[i];

		}

	}

}