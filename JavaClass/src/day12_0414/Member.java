package day12_0414;

public class Member {
	// 필드 선언
	String id;
	String password;
	String name;
	int age;
	
	// 기본생성자
	Member () {
	
	}
	
	// 매개변수 있는 생성자
	Member (String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// info 메소드
	void info(){
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// update 메소드
	void update(String name) {
		this.name = name;
	}
	
	// myName 메소드
	String myName() {
		return this.name;
	}
	
}