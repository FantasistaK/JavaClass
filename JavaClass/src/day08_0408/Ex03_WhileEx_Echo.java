package day08_0408;

import java.util.Scanner;

public class Ex03_WhileEx_Echo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str="", end="종료";
		boolean run=true;
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
		
		while(run) {
			System.out.print(">");
			str=scan.nextLine();
			System.out.println(str);
			
			//if를 쓸 때 실행문이 한줄이라면 {} 없이 쓰는것도 가능
			if(str.equals(end))
				run = false;
		}
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}

}
