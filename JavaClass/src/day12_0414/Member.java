package day12_0414;

public class Member {
	// �ʵ� ����
	String id;
	String password;
	String name;
	int age;
	
	// �⺻������
	Member () {
	
	}
	
	// �Ű����� �ִ� ������
	Member (String id, String password, String name, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// info �޼ҵ�
	void info(){
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// update �޼ҵ�
	void update(String name) {
		this.name = name;
	}
	
	// myName �޼ҵ�
	String myName() {
		return this.name;
	}
	
}