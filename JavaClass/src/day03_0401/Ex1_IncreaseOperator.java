package day03_0401;

public class Ex1_IncreaseOperator {

	public static void main(String[] args) {
		/*
		 * ����(variable)
		 * ���������� (++, --)
		 * ������ �Ǵ� �����ڿ� ���
		 * ��ġ�� ���� ������ �޶���
		 * ++var : var�� ������ �ִ� ���� 1�� ������ �� ���꿡 ���
		 * var++ : var�� ������ �ִ� ���� ���꿡 ��� �� var�� ���� 1����
		 */
		
		int num1 = 10;
		int num2 = 10;
		int num3 = 0;
		
		// ++�� �����տ� ���� ��
		System.out.println("num1 : " + num1); // 10
		num3 = ++num1 + 10;                   // 11+10
		System.out.println("num1 : " + num1); // 11
		System.out.println("num3 : " + num3); // 21
		
		// ++�� �����ڿ� ���� ��
		System.out.println("num1 : " + num1); // 11
		num3 = num1++ + 10;                   // 11+10
		/*
		 * 1. num1 = 11
		 * 2. num1�� ������ �ִ� ���� ���� ��꿡 Ȱ��
		 * 3. 11 + 10 ����� num3�� ����
		 *    num3�� ���� 21�� ��
		 * 4. num1 �ڿ� ���� ���������ڸ� ó���ؾ��ϱ� ������
		 *    num1�� ���� 12�� ��
		 */
		System.out.println("num1 : " + num1); // 12
		System.out.println("num3 : " + num3); // 21

		num3 = num1++ + num2++;               // 12+10 = 22
		System.out.println("num1 : " + num1); // 13
		System.out.println("num2 : " + num2); // 11
		System.out.println("num3 : " + num3); // 22
		
	}

}
