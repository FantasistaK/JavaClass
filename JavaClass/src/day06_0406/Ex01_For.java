package day06_0406;

public class Ex01_For {

	public static void main(String[] args) {
		/*
		 * for문 (반목분) 
		 * 반복문 : 어떠한 조건에서 똑같은 내용을 계속 반복실행해야 할 때
		 * 		  그리고 특정 조건에 도달하면 반복을 멈춤
		 *  반복조건, 반복종료조건(특정값 또는 특정횟수)
		 */
		// 1,2,3,4,5를 서로다른줄에 출력해보세요
		
//		int num=0;
//		num=1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
		
		System.out.println("for문 시작전");
		
		for(int i=0;i<=3;i++) {
			System.out.println("for문 내부");
			System.out.println("반복변수 i값 : " + i);
		}
		
		System.out.println("for문 종료후");
		
	}

}
