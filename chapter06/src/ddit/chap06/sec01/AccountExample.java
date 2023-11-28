package ddit.chap06.sec01;

public class AccountExample {
	
	public static void main(String[] args) {
		//다음 기능을 수행할 수 잇는 계좌클래스(account)를 생성하시오.
		//속성:예금주(String), 잔고(int)
		//메서드: 입금(deposit), 출금(withdraw), 잔액조회(getInfo)
		
			Account ac1=new Account("홍길순");
			
			ac1.deposit(100000);
			ac1.getInformation();
			
			int money=ac1.withdraw(50000);
			System.out.println("출금액수 : "+money);
			ac1.getInformation();
		
		

	}
	

}
