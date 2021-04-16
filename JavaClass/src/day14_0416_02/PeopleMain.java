package day14_0416_02;

import java.util.*;

public class PeopleMain {

	public static void main(String[] args) {
		
		
		String var1 = ""; // var1 : String 클래스 타입의 변수
				
		// p1 : People 클래스 타입의 변수
		People p1 = new People();
		p1.setName("이름1");
		p1.setrNumber("111111-1111111");
		p1.setAddress("서울");
		p1.setAge(10);
				
		People p2 = new People("이름2", "222222-2222222", "인천", 20);
				
		People p3 = new People();
		p3.setName("이름3");
		p3.setrNumber("333333-3333333");
		p3.setAddress("부산");
		p3.setAge(30);
		
		// peopleList : List타입의 클래스 변수 
		List<People> peopleList = new ArrayList<People>();
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		
//		for(int i=0;i<peopleList.size();i++) {
//			
//			System.out.println(peopleList.get(i).getName());
//			System.out.println(peopleList.get(i).getrNumber());
//			System.out.println(peopleList.get(i).getAddress());
//			System.out.println(peopleList.get(i).getAge());
//			
//		}
//		
//		System.out.println(peopleList.get(0));
//		System.out.println(p1.toString());
		
		for(int i = 0; i < peopleList.size(); i++)
			System.out.println(peopleList.get(i));
		
		
		
		// People Service 객체 선언
		
		PeopleService ps = new PeopleService();
		
		// listPrint 메소드 호출(호출하면서 peopleList 넘김)
		System.out.println("listPrint 호출 전");
		ps.listPrint(peopleList);
		System.out.println("listPrint 호출 끝");
		
		ps.peoplePrint(p2);
		
	}

}

















