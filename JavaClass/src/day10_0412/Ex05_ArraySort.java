package day10_0412;

public class Ex05_ArraySort {

	public static void main(String[] args) {
		/*
		 * 배열 정렬 
		 * 오름차순 또는 내림차순 정렬
		 * 중첩 for문
		 */
		int[] num = { 3, 2, 1, 5, 4 };

		// 1, 2, 3, 4, 5로 정렬하기

		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					int swap = num[i];
					num[i] = num[j];
					num[j] = swap;

				}

			}

		}

		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);

		}

	}

}