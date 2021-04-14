package day02_0331;

public class Ex4_CompareOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * <, >, <=, >=, ==, !=
		 * 결과값이 true, false
		 * a == b : a,b값이 같으면 T, 다르면 F
		 * a != b : a,b값이 다르면 T, 같으면 F
		 */
		
		// 두개의 정수형 변수를 선언하여 각각의 비교연산 결과값을 출력해보세요
		
		int num1, num2;
		num1 = 5;
		num2 = 3;
					
		boolean result;
		
		result=num1>num2;
		System.out.println(num1 + ">" + num2 + "의 값 : " + result);
		
		result=num1<num2;
		System.out.println(num1 + "<" + num2 + "의 값 : " + result);
		
		result=num1>=num2;
		System.out.println(num1 + ">=" + num2 + "의 값 : " + result);
		
		result=num1<=num2;
		System.out.println(num1 + "<=" + num2 + "의 값 : " + result);
		
		result=num1==num2;
		System.out.println(num1 + "==" + num2 + "의 값 : " + result);
		
		result=num1!=num2;
		System.out.println(num1 + "!=" + num2 + "의 값 : " + result);
		

	}

}
