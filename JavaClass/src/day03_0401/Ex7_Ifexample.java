package day03_0401;

import java.util.Scanner;

public class Ex7_Ifexample {

	public static void main(String[] args) {
		
		int num1;
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("������ �Է��ϼ��� : ");
	    num1 = scan.nextInt();
	    
	    if (num1 >= 90) {
	    	System.out.println("A�����Դϴ�.");
	    } else if (num1 >= 80) {
	    	System.out.println("B�����Դϴ�.");
	    } else if (num1 >= 70) {
	    	System.out.println("C�����Դϴ�.");
	    } else if (num1 >= 60) {
	    	System.out.println("D�����Դϴ�.");
	    } else {
	    	System.out.println("F�����Դϴ�.");
	    }
		
	}

}
