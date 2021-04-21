package day07_0407;

import java.util.Scanner;

public class Ex05_ForEx {

	public static void main(String[] args) {
		// 숫자 입력 : 100
		// 1부터 100까지 2,3배수 제외한 합계 : 1633
		
		Scanner scan = new Scanner(System.in);
		int num=0, sum=0;
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		// 1. 1부터 입력받은 숫자까지 만들기 for
		// 2. 숫자 중에서 2,3의 배수가 아닌 숫자 걸러내기 if
		// 3. 걸러낸 숫자들의 합계 구하기 sum(누적합)		
		for (int i=1;i<=num;i++) {
			if ((i%2)!=0) {
				if ((i%3)!=0) {
					sum+=i;
				}
			}
		}
		System.out.println("1부터 "+num+"까지 2,3배수 제외한 합계 : "+sum);

	}

}