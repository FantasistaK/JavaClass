package day08_0408;

public class Ex01_WhileEx_RandumNumber {

	public static void main(String[] args) {
		// 주사위게임(프로그램을 실행했을 때 숫자가 6이 나오면 종료되는 프로그램)
		
		int num=0;
		while (num<6) {
			num=(int)(Math.random()*6)+1;
			System.out.println("숫자:"+num);
		}
		System.out.println("6이 나왔네요 종료합니다.");
		System.out.println("반복문 종료됨.");
		
//		boolean run = true;
//		while (run) {
//			int num=(int)(Math.random()*6)+1;
//			System.out.println("숫자:"+num);
//			if(num==6) {
//				System.out.println("6이 나왔네요 종료합니다.");
//				run = false;
//			}
//		}
//		System.out.println("반복문 종료됨.");
		
	}

}