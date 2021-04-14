package day02_0331;

public class Ex5_AssignmentOperator {

	public static void main(String[] args) {
		/*
		 * 대입연산자
		 * +=, -=, *=, /=, %=
		 * a += b -> a = a + b
		 */
		
		int num1, num2;
		num1 = 5;
		num2 = 3;
		
		System.out.println(num1 + "+=" + num2 + "의 값 : " + (num1 += num2)); // num1 = num1 + num2
		System.out.println(num1 + "-=" + num2 + "의 값 : " + (num1 -= num2)); // num1 = num1 - num2
		System.out.println(num1 + "*=" + num2 + "의 값 : " + (num1 *= num2)); // num1 = num1 * num2
		System.out.println(num1 + "/=" + num2 + "의 값 : " + (num1 /= num2)); // num1 = num1 / num2
		System.out.println(num1 + "%=" + num2 + "의 값 : " + (num1 %= num2)); // num1 = num1 % num2
	 	
	}

}
