package day07_0407;

public class Ex06_While {

	public static void main(String[] args) {
		/*
		 * while(�ݺ�����) {
		 * 		�ݺ����೻��
		 * }
		 */
		
		int i=1;
		int num=0;
		while(i<=10) {
			System.out.println(i);
			i++;
			num=0;
		}
		
		System.out.println("while�� ��");
		System.out.println(i);
		System.out.println(num);
		
		boolean run = true;
		while(run) {
			System.out.println("���ѹݺ��˴ϴ�.");
			i++;
			if(i==100 ) {
				System.out.println("���ѹݺ� ����");
				run=false;
			}
		}
	}

}
