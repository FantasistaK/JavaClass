package day07_0407;

public class Ex07_Dowhile {

	public static void main(String[] args) {
		/* 
		 * do while문
		 * while문은 반본조건이 맞지 않으면 반복문 실행을 전혀 하지 않음
		 * do while문은 조건이 맞든 안맞든 한번은 실행하고 반복조건을 따짐
		 * 
		 * while(반복조건) {
		 * 
		 * }
		 * 
		 * do {
		 * 	 반복실행내용
		 * 
		 * } while(반복조건);
		 * 
		 */
		int i = 10;
		do {
			System.out.println("반복문 내부");
		} while(i<=5);
	}

}