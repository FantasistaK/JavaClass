package day07_0407;

public class Ex04_For_xyfunction {

	public static void main(String[] args) {
		/*
		 * 4x + 5y = 60을 만족하는 모든 x,y값을 출력하시오. 
		 * (단 x,y는 0보다 크고 10보다 작은 정수)
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