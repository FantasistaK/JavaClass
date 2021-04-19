package day03_0401;

public class Ex9_RandomMethod {

	public static void main(String[] args) {
		// Random 메소드
		// 특정 범위 내에서 숫자를 하나 출력해주는 메소드
		// 1~10 사이의 숫자 하나를 무작위로 발생
		/* (int)(Math.random() * 10) + 1
		 * random() 0보다 크거나 같고 1.0보다 작은 숫자를 발생시킴
		 */
		System.out.println(Math.random());
		System.out.println((Math.random()*10));
		System.out.println((int)(Math.random()*10)); // 강제 형변환
		System.out.println(((int)(Math.random()*10)+1)); // 강제 형변환
		
		System.out.println(((int)(Math.random()*45)+1)); // 1~45 숫자중 하나
	}

}
