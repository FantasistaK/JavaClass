package day02_0331;

public class Ex1_Variables {

	public static void main(String[] args) {
		/*
		 * 변수 선언, 값 대입, 출력
		 * var1 : 10을 가지고 있는 정수형변수
		 * var2 : 0.1234를 가지고 있는 실수형변수
		 * var3 : true를 가지고 있는 논리형변수
		 * var4 : 오늘은 수요일 을 가지고있는 문자열변수
		 * 선언 및 값 대입 후
		 * var1, var2, var3, var4의 값을 각각 출력해보세요
		 */
		
		int var1=10;
		double var2=0.1234;
		boolean var3=true;
		String var4="오늘은 수요일";
				
		System.out.println("var1 : " + var1); // + : 연결 역할
		System.out.println(var2);
		System.out.println(var1 + var2); // + : 수식 역할
		System.out.println(var3);
		System.out.println(var4);
				
		// var1 : 10
		// var5라는 정수형변수 선언
		int var5;
//		int var5; // var5를 중복선언 불가능
//		var5; // 변수를 사용할 때는 어떤 값을 대입하는 등의 내용이 필요
		var5 = 10;
		
		int var6;
		var6 = 8;
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		var5 = var6;
		// var6에 있는 값을 var5에 대입 
				
		// var5, var6의 값을 각각 출력해보세요
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
	
		int sum=0;
		sum = var5 + var6;
		System.out.println("Sum : " + sum);
		sum = 100;
		System.out.println("Sum : " + sum);
		int sum1 = 10;
		// computer : compute(계산) + r
		
	}

}
