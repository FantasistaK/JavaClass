package day13_0415_02;

import java.util.*;

public class Ex02_ArrayListEx {

	public static void main(String[] args) {
		// 

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < 5 ; i++) {
			System.out.print("단어를 입력하세요 : ");
			list.add(sc.nextLine());
		}
		
		int maxlength = 0, maxindex = 0;

		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
			
//			if (maxlength < list.get(i).length()) {
//				maxlength = list.get(i).length();
//				maxindex = i;
//			}
			
			if (list.get(maxindex).length() < list.get(i).length())
				maxindex = i;
			
			
		}
		
		System.out.print("가장 긴 단어는 : " + list.get(maxindex));
		
	}

}
