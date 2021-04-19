package day03_0401;

public class Ex5_If {

	public static void main(String[] args) {
		// if 조건을 비교연산식 활용
		int num1=0, num2=0;
		num1 = 50;
		num2 = 50;
		if(num1 > num2 && num1 > 0) {
			// num1이 num2보다 클 때 이부분이 실행
			System.out.println("num1이 큽니다");
		} else {
			// num2가 num1보다 클 때 이부분이 실행
			// num2가 num1과 같을 때에도 실행
			
			// num1이 num2보다 크지 않을 때 이부분이 실행
			System.out.println("num2가 큽니다");
		}

	}

}
