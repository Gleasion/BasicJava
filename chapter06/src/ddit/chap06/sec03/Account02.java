package ddit.chap06.sec03;

public class Account02 {

	private String accountNo;
	private String name;
	private int balance;
	
	public Account02(String accountNo, String name, int balance) {
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	
	public void getInfo() {
		System.out.println("예금주 : "+name+", 계좌번호 : \""+accountNo+"\" 잔고 : "+balance+"원");
	}
	
	
	
	
	
	
}
