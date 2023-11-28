package ddit.chap06.sec04;

public class AccountService {

	public static void main(String[] args) {
		//Account a1=Account. //녹색에 빨강색 S : Static
		
		Account a1=Account.getInstance(); //private이여서 new 연산자 쓰면 오류
		System.out.println("a1="+a1);
		
		Account a2=Account.getInstance();
		System.out.println("a2="+a2);

		Account a3=Account.getInstance();
		System.out.println("a3="+a3);
		
		
	}

}
