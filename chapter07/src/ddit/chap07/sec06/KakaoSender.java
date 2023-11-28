package ddit.chap07.sec06;

public class KakaoSender extends ContentSender{
	String telNo;
	
	public KakaoSender() {}
	
	public KakaoSender(String title, String content, String telNo) {
		super(title,content);
		this.telNo=telNo;
	}
	
	@Override
	public void sendMsg(String name) {
		System.out.println("받는 사람 전화번호 : "+telNo);
		System.out.println("제목 : "+title);
		System.out.println("내용 : "+content);
		System.out.println("보낸 사람 : "+name);
	}
	
}
