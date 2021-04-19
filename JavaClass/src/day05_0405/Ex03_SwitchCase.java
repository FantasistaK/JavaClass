package day05_0405;

public class Ex03_SwitchCase {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * switch case 
		 */

	int num = 10;
	String str = "가";
	
	switch(str) {
	
		case "가":
			System.out.println("num값이 0 이네요");
			break;  // 실행이 끝나면 switch case 문을 빠져나가라는 문장
		
		case "나":
			System.out.println("num값이 1 이네요");
			break;
		
		default:
			System.out.println("case에서 지정한 값이 아닐 때 실행됩니다.");
			break;
		
	}
		
	}

}
