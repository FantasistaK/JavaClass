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
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("---------------------------------------------------");
			System.out.print("����> ");
			int menu = sc.nextInt();
							
			switch (menu) {
			
				case 1:
					
					System.out.print("�л���> ");
					student = sc.nextInt();
					
					score = new int[student];
					sort = new int[student];
					
					break;
					
				case 2:
					
					if (student!=0) {
						for (int i=0; i<score.length ; i++) {
							System.out.print((i+1)+"��° �л����� : ");
							score[i]=sc.nextInt();
							sort[i]=score[i];
							sum+=score[i];
							if (score[i]>max)
								max=score[i];
						}
					} else {
						System.out.println("�л����� �Է� �ϼ���");
					}
					break;
					
				case 3:
					
					if (student!=0) {
						for (int i=0; i<score.length ; i++) {
							System.out.println((i+1)+"��° �л����� : "+score[i]);
						}
					} else {
						System.out.println("�л����� �Է� �ϼ���");
					}
					break;
					
				case 4:
					
					if (student!=0) {
						System.out.println("�ְ����� : "+max);
						System.out.println("������� : "+(double)(sum/student));
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
						System.out.println("�л����� �Է� �ϼ���");
					}
					break;
					
				case 5:
					
					System.out.println("���α׷��� ���� �մϴ�.");
					run = false;
					break;
					
				default :
					
					System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
					break;
			
			}
			
		} while(run);
		

	}

}
