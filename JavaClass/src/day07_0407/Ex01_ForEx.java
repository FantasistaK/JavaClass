package day07_0407;

public class Ex01_ForEx {

	public static void main(String[] args) {
		// 10���� 1���� ����ϱ�
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}

		// ��ø for��
		System.out.println("i for�� ����");
		for(int i=1; i<=2; i++) {
			System.out.println("j for�� ����");
			for(int j=1; j<=3; j++) {
				System.out.print("i�� : "+i);
				System.out.println(", j�� : "+j);
			}
			System.out.println("j for�� ��");
		}
		System.out.println("i for�� ��");
		
	}

}
