package day07_0407;

public class Ex02_MultiTable {

	public static void main(String[] args) {
		// ������ ����ϱ�

		for (int i = 2; i <= 9; i++) {  //��������� ����
			for (int j = 1; j <= 9; j++) {  //�ڿ� �������� ���ڸ� ����
				System.out.print(i + "x" + j + "=" + (i * j));
				System.out.print("\t");  //tab
			}
//			System.out.println();
			System.out.print("\n");  //new line
		}
	}
}
