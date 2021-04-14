package day02_0331;

public class Ex2_Operator {

	public static void main(String[] args) {
		/*
		 * 연산자(Operator) : 연산(계산)에 사용하는 기호
		 * + : 덧셈
		 * - : 뺄셈
		 * * : 곱셈
		 * / : 나눗셈
		 * % : 나머지
		 */
		// 정수형변수를 2개 선언하여
		// 각각의 연산자 계산결과를 출력해보세요
		// 계산결과를 저장할 변수를 하나 더 써도 됨
		
		// 변수를 한번에 여러 개 선언하기 
		
		int var1, var2;
		var1=5;
		var2=3;
		int result;
					
		result=var1+var2;
		System.out.println("+ 결과 : " + result);
		
		result=var1-var2;
		System.out.println("- 결과 : " + result);
		
		result=var1*var2;
		System.out.println("* 결과 : " + result);
		
		// 정수형 변수간의 나눗셈 결과값은 몫이다
		result=var1/var2;
		System.out.println("/ 결과 : " + result);
						
		double var3, var4;
		double result1;
		var3 = 5.0;
		var4 = 3.0;
		result1 = var3/var4;
		System.out.println("/ 결과 : " + result1);
		
		// 정수형 변수간의 %연산 결과값은 나머지이다
		result=var1%var2;
		System.out.println("% 결과 : " + result);

	}

}
