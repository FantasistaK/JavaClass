package day13_0415_02;

import java.util.*;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		/*
		 * Collection Framework : List, Set, Map
		 */
		// ArrayList ����(���嵥���� Ÿ�� : String)
		List<String> list = new ArrayList<String>();
		
		// list �� ������ ���� : add �޼ҵ� ȣ��
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add(1,"�׹�°");
		
		// list�� ��� ������ ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// list ũ�� Ȯ��
		System.out.println(list.size());
		
		// list ������ ����
		list.remove(1);
		System.out.println(list.get(1));
		
		// for���� �̿��Ͽ� list�� ��� ��� ������ ���
		
		for (int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// list�� ������ ������ ��
		List<Integer> list1 = new ArrayList<Integer>(); // Wrapper Class
		
		String var = "��";
		
		
		
	}

}
