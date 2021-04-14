package day12_0414;

public class StudentMain {

	public static void main(String[] args) {

		
		// 기본생성자를 이용한 객체선언
		Student stu1 = new Student();
		stu1.name = "학생1";
		stu1.stuNum = 12345;
		System.out.println(stu1.name);
		System.out.println(stu1.stuNum);
		
		// 매개변수가 있는 생성자를 이용한 객체선언
		Student stu2 = new Student("학생2",11111);
		System.out.println(stu2.name);
		System.out.println(stu2.stuNum);
		
		
		
		
		
		
		
		System.out.println("메소드 호출전");
		
		// fieldPrint 메소드 호출
		stu1.fieldPrint();
		
		System.out.println("메소드 호출끝");
		
		stu2.fieldPrint();
		
		Student stu3 = new Student("학생3",22222);
		stu3.fieldPrint();
		
		System.out.println("리턴있는 메소드 호출");
		// 리턴이 있는 메소드를 호출할 때는 호출만하고
		// 끝나는 것이 아니라 리턴값을 활용하는 내용이 필요
		
		stu1.numberMethod();
				
		int aa = 0;
		System.out.println(aa);  // 메소드 호출 전
		aa = stu1.numberMethod();
		System.out.println(aa);  // 메소드 호출 후
		
		System.out.println(stu1.numberMethod());
		
		System.out.println("String 메소드 호출");
		System.out.println(stu3.stringMethod());
		
		String bb = stu3.stringMethod();
		System.out.println(bb);
		
		Student stu4 = new Student();
		int cc = stu4.numberMethod2(30);
		System.out.println(cc);
		
		int number1 = 50;
		cc = stu4.numberMethod2(number1);
		System.out.println(cc);
		
		
	}

}
