package day11_20210413_01;

public class People {
	// 필드, 생성자, 메소드
	// 필드 선언
	String name;
	int age;
	String nation;
	
	// 생성자 선언
	// 기본생성자
	People() {
		nation = "대한민국";
	}
	
	// 매개변수가 있는 생성자
	//           ↓
	People(String name, int age) {
		
		// 매개변수를 사용하는 이유
		/*
		 * 생성자에서 필드값을 세팅하거나 
		 * 메소드에서 처리할 값을 넘길 때
		 */
		// 넘겨받은 매개변수를 필드값으로 저장
		// 매개변수이름과 필드이름은 동일하게쓰는게 일반적이며
		// 구분을 위해 필드앞에는 this.를 붙인다
		this.name = name;
		this.age = age;

	}
	
}