package day13_0415;

public class Board {

	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;
	
	Board() {
		
	}
	
	Board(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
	
	void boardWrite (int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
	
	void boardView () {
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}
	
	void boardUpdate (String bTitle, String bContents) {
		this.bTitle = bTitle;
		this.bContents = bContents;
	}
	
}
