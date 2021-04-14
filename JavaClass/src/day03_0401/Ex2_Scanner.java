package day03_0401;

import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();
		
		System.out.println("스캐너로 입력한 이름 : " + name);
		
		
		
		
		scan.close(); // 스캐너 객체를 종료하는 close() 메소드
		
	}

}
