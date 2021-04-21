package day16_0420_02;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();

		BoardDTO board = new BoardDTO();
		
		BoardService bs = new BoardService();
		
		int writingNumber = 0;
		
		do {

			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 글쓰기 | 2. 글목록 | 3. 글조회 | 4. 글수정 | 5. 글삭제 | 6. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();

			switch (select) {

			case 1:

				System.out.print("글제목 : ");
				String title = sc.next();
				System.out.print("비밀번호 : ");
				String password = sc.next();
				System.out.print("작성자 : ");
				String writer = sc.next();
				System.out.print("내용 : ");
				String contents = sc.next();
				writingNumber = boardList.size()+1;
				
				board = new BoardDTO(writingNumber, title, password, writer, contents);
				boardList.add(board);

				break;
				
			case 2:
				// 목록 출력을 위한 메소드 호출(단순 출력만 하기 때문에 리턴은 필요 없음)
				bs.boardList(boardList);
				
				break;
				
			case 3:
				// 글 조회
				bs.writingInfo(boardList);
				
				break;
				
			case 4:
				
				boardList = bs.modify(boardList);
				
				break;
				
			case 5:
				
				boardList = bs.delete(boardList);
				
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
