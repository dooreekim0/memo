package memo.entity;

public class MemoDto {
	private int no;
	private String content;
	private String when;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	@Override
	public String toString() {
		return "MemoDto [no=" + no + ", content=" + content + ", when=" + when + "]";
	}
	public MemoDto() {
		super();
	}
	
	
	
}
