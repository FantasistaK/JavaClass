package day17_0421;

import java.util.*;

public class LibraryService {

	Scanner sc = new Scanner(System.in);
	
	public void clientList(List<ClientDTO> clientList) {
		
		for (int i=0; i<clientList.size();i++) {
			System.out.println(clientList.get(i));
		}
		
	}

	public void bookList(List<BookDTO> bookList) {
		
		for (int i=0; i<bookList.size();i++) {
			System.out.println(bookList.get(i));
		}
		
	}

	public List<BookDTO> bookLoan(List<BookDTO> bookList) {
		
		System.out.print("고객 번호 : ");
		int clientNumber = sc.nextInt();
		System.out.print("빌릴책 번호 : ");
		int bookNumber = sc.nextInt();
		int loan = 0;
		
		for (int i=0;i<bookList.size();i++) {
			if (bookNumber == bookList.get(i).getBookNumber()) {
				if (bookList.get(i).isBookCheck()) {
					System.out.println("대출이 불가능 합니다.");
				} else {
					System.out.println("대출이 완료 되었습니다.");
					bookList.get(i).setBookCheck(true);
					bookList.get(i).setClientNumber(clientNumber);
				}
				loan = 1;
			}
		}
		
		if (loan != 1) 
			System.out.println("대출이 불가능 합니다.");
		
		return bookList;
		
	}

}
