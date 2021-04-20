package day16_0420_02;

import java.util.*;

public class BoardService {

	Scanner sc = new Scanner(System.in);
	
	public void boardList(List<BoardDTO> boardList) {
		
		if (boardList.size()>0)
			for (int i = 0; i < boardList.size(); i++)
				System.out.println(boardList.get(i));
		else
			System.out.println("글이 존재하지 않습니다.");
		
	}

	public void writingInfo(List<BoardDTO> boardList) {
		
		System.out.print("글번호를 입력하세요 : ");
		int writingNumber = sc.nextInt();
		
		int login = 0;
		
		for (int i = 0; i < boardList.size(); i++) {
			
			if (writingNumber == boardList.get(i).getWritingNumber()) {
				
				System.out.println(boardList.get(i));
				login = 1;
				
			}
			
		}
		
		if (login!=1)
			System.out.println("글번호가 존재하지 않습니다.");
		
	}

	public List<BoardDTO> modify(List<BoardDTO> boardList) {
		
		System.out.print("글번호를 입력하세요 : ");
		int writingNumber = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		
		int login = 0;
		
		for (int i = 0; i < boardList.size(); i++) {
			if (writingNumber==boardList.get(i).getWritingNumber() && password.equals(boardList.get(i).getPassword())) {
				login = 1;
				System.out.print("변경할 제목을 입력하세요 : ");
				String title = sc.next();
				boardList.get(i).setTitle(title);
				System.out.print("변경할 내용을 입력하세요 : ");
				String contents = sc.next();
				boardList.get(i).setContents(contents);
				System.out.println(boardList.get(i));
				System.out.println("글 수정이 완료 되었습니다.");
			}
		}
		
		if (login != 1)
			System.out.println("글번호 또는 비밀번호가 틀립니다.");
		
		return boardList;
		
	}

	public List<BoardDTO> delete(List<BoardDTO> boardList) {
		
		System.out.print("글번호를 입력하세요 : ");
		int writingNumber = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		
		int login = 0;
		
		for (int i = 0; i < boardList.size(); i++) {
			if (writingNumber==boardList.get(i).getWritingNumber() && password.equals(boardList.get(i).getPassword())) {
				login = 1;
				boardList.remove(i);
				for (int j=i; j<boardList.size(); j++) {
					boardList.get(j).setWritingNumber(boardList.get(j).getWritingNumber()-1);
				}
				System.out.println("글 삭제가 완료 되었습니다.");
			}
		}
		
		if (login != 1)
			System.out.println("글번호 또는 비밀번호가 틀립니다.");
		
		return boardList;
		
	}

}
