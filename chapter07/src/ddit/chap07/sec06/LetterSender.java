package ddit.chap07.sec06;

public class LetterSender extends ContentSender {
	String address; //받는 사람 주소
	
	public LetterSender() {}
	
	public LetterSender(String title, String content,
			String address){
		super(title,content);
		this.address=address;
		this.content=content;
	}
	
	@Override
	public void sendMsg(String name) {
		System.out.println("받는 사람 : "+name);
		System.out.println("받는이 주소 : "+address);
		System.out.println("내용 : "+content);

	}

}
