package day06_0406;

public class Ex06_ForEx {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자 중에서 3의 배수만 출력하기

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
