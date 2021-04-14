package day08_0408;

import java.util.Scanner;

public class Ex06_While_UpDown {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int answer=0, input=0, count=0, min=1, max=100;
		answer=(int)(Math.random()*100)+1;	
		System.out.println("Up & Down");
		while (true) {
			System.out.print(min+"부터 "+max+"까지의 숫자를 입력하세요 : ");
			input = scan.nextInt();
			count++;
			if (input>=min && input<=max) {
				if (input>answer) {
					System.out.println(input+"보다 작은 수를 입력하세요.");
					max=input-1;
				} else if (input<answer) {
					System.out.println(input+"보다 큰 수를 입력하세요.");
					min=input+1;
				} else {
					System.out.println("정답입니다.");
					System.out.println("시도횟수는 "+count+"번 입니다.");
					break;
				}
			} else { 
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
