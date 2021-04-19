package day13_0415;

public class BoardMain {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		
		b1.boardWrite(1,"제목1","작성자1","내용1");
		b1.boardView();
		b1.boardUpdate("제목1-1", "내용1-1");
		b1.boardView();
		
		Board b2 = new Board(2, "제목2", "작성자2", "내용2");
		
		b2.boardView();
		b2.boardUpdate("제목2-1", "내용2-1");
		b2.boardView();

	}

}
