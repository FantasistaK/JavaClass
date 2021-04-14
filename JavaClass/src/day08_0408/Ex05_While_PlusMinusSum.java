package day08_0408;

public class Ex05_While_PlusMinusSum {

	public static void main(String[] args) {
		//
		
		int count=1, num=0, sum=0;
		boolean run = true;
		
		while (run) {
			
			if (count%2==0) {
				num=-count;
				System.out.print("("+num+")");
			} else {
				num=count;
				System.out.print(num);
			}
			
			sum+=num;
			
			if (sum>=100) {
				run = false;
				System.out.print("=");
			} else {
				count++;
				System.out.print("+");
			}
			
		}
		
		System.out.println(sum);
		
		System.out.println("정답은 "+num+"입니다.");
		
	}

}
