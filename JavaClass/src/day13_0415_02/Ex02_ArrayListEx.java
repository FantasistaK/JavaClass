package day13_0415_02;

import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		/*
		 * ArrayList에 영어로 된 단어 5개를 스캐너로 입력받고
		 * 입력받은 단어를 모두 출력하고
		 * 마지막에는 가장 긴 단어를 출력하시오
		 */
		
		String var1 = "water";
		System.out.println(var1.length());
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<5;i++) {
			System.out.print("단어를 입력하세요 :");
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
		
		System.out.println("가장 긴 단어는 : "+list.get(max));
		
		
	}

}
