package day13_0415;

public class BoardMain {

	public static void main(String[] args) {
		
		Board b1 = new Board();
		
		b1.boardWrite(1,"����1","�ۼ���1","����1");
		b1.boardView();
		b1.boardUpdate("����1-1", "����1-1");
		b1.boardView();
		
		Board b2 = new Board(2, "����2", "�ۼ���2", "����2");
		
		b2.boardView();
		b2.boardUpdate("����2-1", "����2-1");
		b2.boardView();

	}

}
