package day07_0407;

public class Ex03_Star {

	public static void main(String[] args) {
		// 별찍기
		// *
		// **
		// ***
		// ****
		// *****
		
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}