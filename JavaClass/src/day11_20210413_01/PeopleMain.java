package day11_20210413_01;

public class PeopleMain {

	public static void main(String[] args) {
		// PeopleMain 클래스에서 People 클래스를
		// 객체로 만들어 활용
		
		// People 클래스 객체 선언
				
//     객체로 만들 클래스 이름		
//	      ↑
		People p = new People();
//	           ↓          ↓
// 현재 파일에서 쓸 객체 이름	  ↓
//                        ↓
//              해당 클래스가 가지고있는 생성자
//              해당 클래스가 별도로 생성자를 정의하고 있지 않다면 기본 생성자를 사용함
		
		// 객체로 선언한 클래스가 가지고 있는
		// 자원(필드, 메소드) 활용
		// People 클래스가 가지고 있는 필드에 값 저장 및 출력
		
		p.name = "이름1";
		p.age = 10;
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.nation);
		p.nation = "미국";
		System.out.println(p.nation);
		
		People p1 = new People();
		p1.name = "이름2";
		System.out.println(p1.name);
		
		People p2 = new People();
		p2.name = "이름3";
		System.out.println(p2.name);
		
		//매개변수가 있는 생성자를 이용한 객체(인스턴스) 생성
		
		People p3 = new People("이름4", 10);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation);
		p3.nation= "캐나다";
		System.out.println(p3.nation);
		p3.name = "이름4변경";
		p3.age = 100;
		System.out.println(p3.name);
		System.out.println(p3.age);
		
		
	}

}
