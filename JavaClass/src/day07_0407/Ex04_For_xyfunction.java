package day07_0407;

public class Ex04_For_xyfunction {

	public static void main(String[] args) {
		/*
		 * 4x + 5y = 60�� �����ϴ� ��� x,y���� ����Ͻÿ�. 
		 * (�� x,y�� 0���� ũ�� 10���� ���� ����)
		 */

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
