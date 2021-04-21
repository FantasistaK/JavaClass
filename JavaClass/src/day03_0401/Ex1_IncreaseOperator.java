package day03_0401;

public class Ex1_IncreaseOperator {

	public static void main(String[] args) {
		/*
		 * 변수(variable)
		 * 증감연산자 (++, --)
		 * 변수앞 또는 변수뒤에 사용
		 * 위치에 따라 역할이 달라짐
		 * ++var : var가 가지고 있는 값에 1을 증가한 뒤 연산에 사용
		 * var++ : var가 가지고 있는 값을 연산에 사용 후 var의 값을 1증가
		 */
		
		int num1 = 10;
		int num2 = 10;
		int num3 = 0;
		
		// ++이 변수앞에 붙을 때
		System.out.println("num1 : " + num1); // 10
		num3 = ++num1 + 10;                   // 11+10
		System.out.println("num1 : " + num1); // 11
		System.out.println("num3 : " + num3); // 21
		
		// ++이 변수뒤에 붙을 때
		System.out.println("num1 : " + num1); // 11
		num3 = num1++ + 10;                   // 11+10
		/*
		 * 1. num1 = 11
		 * 2. num1이 가지고 있는 값을 먼저 계산에 활용
		 * 3. 11 + 10 결과를 num3에 대입
		 *    num3의 값은 21이 됨
		 * 4. num1 뒤에 붙은 증감연산자를 처리해야하기 때문에
		 *    num1의 값은 12가 됨
		 */
		System.out.println("num1 : " + num1); // 12
		System.out.println("num3 : " + num3); // 21

		num3 = num1++ + num2++;               // 12+10 = 22
		System.out.println("num1 : " + num1); // 13
		System.out.println("num2 : " + num2); // 11
		System.out.println("num3 : " + num3); // 22
		
	}

}
