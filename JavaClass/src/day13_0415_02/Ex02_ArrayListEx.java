package day13_0415_02;

import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList�� ����� �� �ܾ� 5���� ��ĳ�ʷ� �Է¹ް�
		 * �Է¹��� �ܾ ��� ����ϰ�
		 * ���������� ���� �� �ܾ ����Ͻÿ�
		 */
		
		String var1 = "water";
		System.out.println(var1.length());
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.print("�ܾ �Է��ϼ��� :");
			list.add(sc.next());
		}
		int maxlength = 0;
		int max = 0;
		
		for(int i=0;i<5;i++) {
			
			System.out.println(list.get(i));
			String word = list.get(i);
			int wordlength = word.length();
			if (maxlength < wordlength) { 
				maxlength = wordlength;
				max = i;
			}
		}
		
		System.out.println("���� �� �ܾ�� : "+list.get(max));
		
		
	}

}
