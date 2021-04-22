package day18_0422_02;

public class TryCatch_01 {

	public static void main(String[] args) {
		/*
		 * 예외(Exception) 처리
		 * 
		 * try catch
		 * 
		 * try {
		 * 	실행할 내용
		 * } catch(익셉션이름 e) {
		 * 	해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 * 
		 */
		
		try {
			int[] num = new int[3];
			num[2] = 10;
			System.out.println("try 마지막줄");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열크기 초과");
			e.printStackTrace();
		} finally {
			System.out.println("예외가 나든 안나든 무조건 여기는 나옵니다.");
		}
		
//		int[] num = new int[3];
//		num[3] = 10;
		
		System.out.println("try catch 끝나고");

	}

}
