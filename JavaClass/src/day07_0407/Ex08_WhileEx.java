package day07_0407;

public class Ex08_WhileEx {

	public static void main(String[] args) {
		/*
		 * while���� �̿��Ͽ� 1���� 10������ �� ����ϱ� 
		 * 2�ܰ� 
		 * 1+2+3+4+5+6+7+8+9+10=55 ���·� ����غ���
		 */
		int i = 1, sum = 0;
		while (i <= 10) {
			sum += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			i++;
		}
		System.out.println(sum);
	}
}
