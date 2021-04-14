package day08_0408;

public class Ex02_WhileEx_RandomNumber {

	public static void main(String[] args) {
		// 주사위 게임 II : 두 개의 주사위를 던져서 두개의합이 5이면 종료되는 프로그램
		
		boolean run = true;
		
		while(run) {
			
			int num1=(int)(Math.random()*6)+1;
			int num2=(int)(Math.random()*6)+1;
			System.out.println("("+num1+","+num2+")");
			
			if(num1+num2==5) {
				run = false;
			}
			
		}

		System.out.println("종료되었습니다.");
		
	}

}
