package day12_0414;

public class MemberMain {

	public static void main(String[] args) {
		// �⺻�����ڸ� �̿��� ��ü����
		Member mb1 = new Member();
		
		mb1.id = "id1";
		mb1.password = "1234";
		mb1.name = "�̸�1";
		mb1.age = 20;
		
		mb1.info();
		mb1.update("�̸�1-1");
		System.out.println(mb1.myName());
		
		// �Ű������� �ִ� �����ڸ� �̿��� ��ü����
		Member mb2 = new Member("id2", "4321", "�̸�2", 30);
		
		mb2.info();
		mb2.update("�̸�2-1");
		System.out.println(mb2.myName());
		

	}

}