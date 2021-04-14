package day12_0414;

public class MemberMain {

	public static void main(String[] args) {
		// 기본생성자를 이용한 객체선언
		Member mb1 = new Member();
		
		mb1.id = "id1";
		mb1.password = "1234";
		mb1.name = "이름1";
		mb1.age = 20;
		
		mb1.info();
		mb1.update("이름1-1");
		System.out.println(mb1.myName());
		
		// 매개변수가 있는 생성자를 이용한 객체선언
		Member mb2 = new Member("id2", "4321", "이름2", 30);
		
		mb2.info();
		mb2.update("이름2-1");
		System.out.println(mb2.myName());
		

	}

}
