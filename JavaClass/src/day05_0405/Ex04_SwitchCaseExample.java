package day05_0405;

import java.util.Scanner;

public class Ex04_SwitchCaseExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word="";
		System.out.print("�ܾ �Է��ϼ��� : ");
		word = scan.nextLine();
		
		switch (word) {			
			case "desk":
				System.out.println("å���Դϴ�.");
				break;
			case "chair":
				System.out.println("�����Դϴ�.");
				break;
			case "monitor":
				System.out.println("������Դϴ�.");
				break;
			case "mouse":
				System.out.println("���콺�Դϴ�.");
				break;
			default:
				System.out.println("������ ���� �ܾ��Դϴ�.");
				break;			
		}

	}

}
