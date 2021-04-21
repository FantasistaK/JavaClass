package day07_0407;

public class Ex02_MultiTable {

	public static void main(String[] args) {
		// 구구단 출력하기

		for (int i = 2; i <= 9; i++) {  //몇단인지를 위해
			for (int j = 1; j <= 9; j++) {  //뒤에 곱해지는 숫자를 위해
				System.out.print(i + "x" + j + "=" + (i * j));
				System.out.print("\t");  //tab
			}
//			System.out.println();
			System.out.print("\n");  //new line
		}
	}
}