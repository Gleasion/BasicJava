package ddit.chap07.sec06;

public class ContentSenderEx {

	public static void main(String[] args) {
		ContentSender c1=new LetterSender("친구에게","낼 보자","대전시 중구 계룔로 846");
		c1.setContent("내일 저녁 7시에 만나자");
		c1.sendMsg("홍길동");
		
		System.out.println("----------------------------");
		ContentSender c2=new KakaoSender("친구에게","낼 보자","010-1234-5678");
		c2.sendMsg("정몽주");
		
	}

}
