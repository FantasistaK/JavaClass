package day07_0407;

public class Ex06_While {

	public static void main(String[] args) {
		/*
		 * while(반복조건) {
		 * 		반복실행내용
		 * }
		 */
		
		int i=1;
		int num=0;
		while(i<=10) {
			System.out.println(i);
			i++;
			num=0;
		}
		
		System.out.println("while문 끝");
		System.out.println(i);
		System.out.println(num);
		
		boolean run = true;
		while(run) {
			System.out.println("무한반복됩니다.");
			i++;
			if(i==100 ) {
				System.out.println("무한반복 종료");
				run=false;
			}
		}
	}

}