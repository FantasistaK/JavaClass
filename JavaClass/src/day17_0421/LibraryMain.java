package day17_0421;

import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		ClientDTO client = null;
		BookDTO book = null;
		
				
		LibraryService ls = new LibraryService();
		
		do {

			System.out.println("------------------------------------------------------------------");
			System.out.println("1. 회원등록 | 2. 도서등록 | 3. 도서대출 | 4. 도서목록 | 5. 회원목록 | 6. 종료");
			System.out.println("------------------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				System.out.print("이름 : ");
				String clientName = sc.next();
				System.out.print("전화번호 : ");
				String clientPhone = sc.next();
				
				int clientNumber = clientList.size()+1;
				
				client = new ClientDTO(clientNumber, clientName, clientPhone);
				clientList.add(client);

				break;
				
			case 2:
				
				System.out.print("도서명 : ");
				String bookName = sc.next();
				System.out.print("저자 : ");
				String bookAuthor = sc.next();
				
				int bookNumber = bookList.size()+1;
				
				book = new BookDTO(bookNumber, bookName, bookAuthor, false, 0);
				bookList.add(book);
				
				break;
				
			case 3:
				
				bookList = ls.bookLoan(bookList);
				
				break;
				
			case 4:
				
				ls.bookList(bookList);
				
				break;
				
			case 5:
				
				ls.clientList(clientList);
				
				break;
				
			case 6:
				
				System.out.println("프로그램을 종료 합니다.");
				run = false;
				break;

			default:
				
				System.out.println("다시 입력해 주세요.");
				
			}
			
		} while(run);

		sc.close();

	}

}
