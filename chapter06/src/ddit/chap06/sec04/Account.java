package ddit.chap06.sec04;
//Single turn 패턴 : 객체가 1번만 생성
//Database 연결 객체 생성시
public class Account {
	
	private static Account instance=null; //만들어진값에 주소값만 계속 반환
	
	private Account() {}
	
	public static Account getInstance() { //자기자신의 instance 반환
		if(instance==null) {
			instance=new Account();
		}
		return instance;
	}
	
	
	
	
}
