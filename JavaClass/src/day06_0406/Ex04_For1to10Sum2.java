package day06_0406;

public class Ex04_For1to10Sum2 {

	public static void main(String[] args) {
		
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
			System.out.print(i);
			
			if(i<=9) { // 1부터 9까지는 +를 출력
				
				System.out.print("+");
				
			} else { // i가 9보다 크면 =을 출력
				
				System.out.print("=");
				
			}
			
		}
		
		System.out.println(sum);
	
	}

}