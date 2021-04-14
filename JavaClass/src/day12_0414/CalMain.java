package day12_0414;

public class CalMain {

	public static void main(String[] args) {
		
		//Cal 클래스 객체 선언
		Cal cal = new Cal();	
		//리턴이 없는 메소드 호출
		System.out.print("sum1 메소드 : ");
		cal.sum1(10, 20);
		//리턴이 있는 메소드 호출
		System.out.print("sum2 메소드 : ");
		int sum = cal.sum2(10, 20);
		System.out.println(sum);
		
	}

}
