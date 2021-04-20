package day16_0420_02;

public class BoardDTO {

	private int writingNumber;
	private String title;
	private String password;
	private String writer;
	private String contents;
	
	BoardDTO() {
		
	}
	
	BoardDTO(int writingNumber, String title, String password, String writer, String contents){
		this.writingNumber = writingNumber;
		this.title = title;
		this.password = password;
		this.writer = writer;
		this.contents = contents;
	}

	public int getWritingNumber() {
		return writingNumber;
	}
	
	public void setWritingNumber(int writingNumber) {
		this.writingNumber = writingNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "BoardDTO [글번호 = " + writingNumber + ", 글제목 = " + title + ", 비밀번호 = " + password + ", 작성자 = "
				+ writer + ", 내용 = " + contents + "]";
	}
	
}
