package day03_0401;

// ���̺귯���� ����� ��
import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�� ����� ����ϱ� ���� ��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
//		Scanner sc = new Scanner(System.in);
		String name = "�ʱⰪ", adress = "�ּ��ʱⰪ";
		int age = 10;
//		System.out.println("��ĳ�� �Է��� name : "+name);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scan.next(); // ��ĳ�� Ŭ�������� �����ϴ� next() �޼ҵ带 �̿��Ͽ�
							// String ���� �Է¹��� �� ����
							// �� �Է��� ���� name ������ �����ϴ� ����
		
		// address, age���� ��ĳ�ʷ� ���� �޾Ƽ� �����ϰ� ����� ���� ����ϼ���
		// �������� ���� ���� nextInt() �޼ҵ带 ���
		
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		scan.nextLine();
		adress = scan.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();

		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+adress);
		System.out.println("���� : "+age);

	}

}
