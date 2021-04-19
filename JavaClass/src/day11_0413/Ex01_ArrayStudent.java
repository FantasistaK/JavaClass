package day11_0413;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int student = 0;
		int[] score = null, sort = null;
		int max = 0, sum = 0, temp = 0;
		
		do {
			
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			int menu = sc.nextInt();
							
			switch (menu) {
			
				case 1:
					
					System.out.print("학생수> ");
					student = sc.nextInt();
					
					score = new int[student];
					sort = new int[student];
					
					break;
					
				case 2:
					
					if (student!=0) {
						for (int i=0; i<score.length ; i++) {
							System.out.print((i+1)+"번째 학생점수 : ");
							score[i]=sc.nextInt();
							sort[i]=score[i];
							sum+=score[i];
							if (score[i]>max)
								max=score[i];
						}
					} else {
						System.out.println("학생수를 입력 하세요");
					}
					break;
					
				case 3:
					
					if (student!=0) {
						for (int i=0; i<score.length ; i++) {
							System.out.println((i+1)+"번째 학생점수 : "+score[i]);
						}
					} else {
						System.out.println("학생수를 입력 하세요");
					}
					break;
					
				case 4:
					
					if (student!=0) {
						System.out.println("최고점수 : "+max);
						System.out.println("평균점수 : "+(double)(sum/student));
						for (int i=0;i<score.length;i++ ) {
							for (int j=i+1;j<score.length;j++) {
								if(sort[i]<sort[j]) {
									temp=sort[i];
									sort[i]=sort[j];
									sort[j]=temp;
								}
							}
						}
						for (int i=0;i<student;i++) {
							System.out.println(sort[i]);
						}
					} else {
						System.out.println("학생수를 입력 하세요");
					}
					break;
					
				case 5:
					
					System.out.println("프로그램을 종료 합니다.");
					run = false;
					break;
					
				default :
					
					System.out.println("잘못 입력 하셨습니다.");
					break;
			
			}
			
		} while(run);
		

	}

}
