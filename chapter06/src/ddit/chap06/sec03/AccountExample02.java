package ddit.chap06.sec03;

public class AccountExample02 {

	public static void main(String[] args) {
		//예제: 계좌번호(accountNo), 예금주(name), 잔액(balace) 속성을 가진 Account클래스를 생성하고 해당 객체를 만드시오.
		// 예금주 : 홍길동. 계좌번호 : "301-1234-45-678", 잔고 : 1000원
		// 예금중 : 정몽주, 계좌번호 : "400-4096-123455", 잔고: 0원

		Account02 ac1=new Account02("301-1234-45-678","홍길동",1000);
		ac1.getInfo();
		
		Account02 ac2=new Account02("400-4096-123455","정몽주",0);
		ac2.getInfo();
	}

}
