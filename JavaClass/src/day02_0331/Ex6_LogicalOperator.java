package day02_0331;

public class Ex6_LogicalOperator {

	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * &&(AND 연산자) : a && b
		 * a, b에 올 수 있는 요소는
		 *  - 논리형(boolean) 변수
		 *  - T, F가 결과로 나오는 식(비교연산식 등)
		 * a,b 모두 T면 결과는 T
		 * a,b 둘 중 하나라도 F면 결과는 F
		 * 
		 * ||(OR 연산자) : a || b
		 * a,b 둘 중 하나라도 T면 결과는 T
		 * a,b 모두 F면 결과는 F
		 * 
		 * !(NOT 연산자) : !a
		 * a가 T면 F로
		 * a가 F면 T로
		 */
		boolean result;
		
		result = true && true;
		System.out.println(result); // T
		result = true && false;
		System.out.println(result); // F
		result = false && true;
		System.out.println(result); // F
		result = false && false;
		System.out.println(result); // F
		
		result = (5>3) && (5==3);
		System.out.println(result); // F
		
		result = true || true;
		System.out.println(result); // T
		result = true || false;
		System.out.println(result); // T
		result = false || true;
		System.out.println(result); // T
		result = false || false;
		System.out.println(result); // F
		
		boolean var1 = true;
		System.out.println(!var1); // F
		
	}

}
