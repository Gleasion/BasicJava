package ddit.chap07.sec06;

public abstract class ContentSender {
	String title;
	String content;
	
	public ContentSender() {}
	
	public ContentSender(String title, String content) {
		this.title=title;
		this.content=content;		
	}
	
	public void setContent(String content) {//일반메소드
		this.content=content;
	}
	
	public abstract void sendMsg(String content);
}
