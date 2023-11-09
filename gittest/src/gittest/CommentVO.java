package gittest;

public class CommentVO {

	private int cno;
	private String writer;
	private String content;
	private String reg_At;
	
	
	
	public CommentVO() {
		
	}
	
	public CommentVO(int cno, String writer, String content, String reg_At) {
		this.cno = cno;
		this.writer = writer;
		this.content = content;
		this.reg_At = reg_At;
	}
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReg_At() {
		return reg_At;
	}
	public void setReg_At(String reg_At) {
		this.reg_At = reg_At;
	}

	@Override
	public String toString() {
		return "CommentVO [cno=" + cno + ", writer=" + writer + ", content=" + content + ", reg_At=" + reg_At + "]";
	}
	
	
	
	
}
