package day03_0401;

import java.util.Scanner;

public class Ex7_Ifexample {

	public static void main(String[] args) {
		
		int num1;
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("점수를 입력하세요 : ");
	    num1 = scan.nextInt();
	    
	    if (num1 >= 90) {
	    	System.out.println("A학점입니다.");
	    } else if (num1 >= 80) {
	    	System.out.println("B학점입니다.");
	    } else if (num1 >= 70) {
	    	System.out.println("C학점입니다.");
	    } else if (num1 >= 60) {
	    	System.out.println("D학점입니다.");
	    } else {
	    	System.out.println("F학점입니다.");
	    }
		
	}

}
