package day03_0401;

public class Ex9_RandomMethod {

	public static void main(String[] args) {
		// Random �޼ҵ�
		// Ư�� ���� ������ ���ڸ� �ϳ� ������ִ� �޼ҵ�
		// 1~10 ������ ���� �ϳ��� �������� �߻�
		/* (int)(Math.random() * 10) + 1
		 * random() 0���� ũ�ų� ���� 1.0���� ���� ���ڸ� �߻���Ŵ
		 */
		System.out.println(Math.random());
		System.out.println((Math.random()*10));
		System.out.println((int)(Math.random()*10)); // ���� ����ȯ
		System.out.println(((int)(Math.random()*10)+1)); // ���� ����ȯ
		
		System.out.println(((int)(Math.random()*45)+1)); // 1~45 ������ �ϳ�
	}

}
