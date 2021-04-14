package day10_0412;

public class Ex01_ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 이름만 선언한 것(크기나 데이터에 대한 것은 전혀 없음.)
		int[] num = null;
		
		if(false) {
			System.out.println("if문 내부");
			num = new int[5]; //num 이라는 변수를 크기가 5인 배열로 만듦. (사용이 가능해짐)
			System.out.println(num.length); // 크기 5가 출력
		}
		
		System.out.println("if문 끝");
		System.out.println(num.length); // 크기 5가 출력

	}

}
