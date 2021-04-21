package day03_0401;

// 라이브러리를 사용할 때
import java.util.Scanner;

public class Ex2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너 기능을 사용하기 위한 스캐너 객체 선언
		Scanner scan = new Scanner(System.in);
//		Scanner sc = new Scanner(System.in);
		String name = "초기값", adress = "주소초기값";
		int age = 10;
//		System.out.println("스캐너 입력전 name : "+name);
		
		System.out.print("이름을 입력하세요 : ");
		name = scan.next(); // 스캐너 클래스에서 제공하는 next() 메소드를 이용하여
							// String 값을 입력받을 수 있음
							// 이 입력한 값을 name 변수에 대입하는 문장
		
		// address, age에도 스캐너로 값을 받아서 저장하고 저장된 값을 출력하세요
		// 정수값을 받을 때는 nextInt() 메소드를 사용
		
		
		System.out.print("주소를 입력하세요 : ");
		scan.nextLine();
		adress = scan.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = scan.nextInt();

		System.out.println("이름 : "+name);
		System.out.println("주소 : "+adress);
		System.out.println("나이 : "+age);

	}

}