package ddit.chap06.sec01;

public class Account {
	//맴버변수: accOwner, balance
	private String accOwner;
	private int balance;
	
	//accOwner: 매게변수-파라미터를 받아서 값을 저장해주는 변수
	//			지역변수-해당 블록을 빠져나가면 메모리에서 사라짐
	public Account(String accOwner){
		//Account.멤버변수=매게변수
		this.accOwner=accOwner;
		//Account.멤버변수=0;
		this.balance=0;
	}
	
	public void deposit(int amount){ //입금
		balance+=amount;
	}
	
	public int withdraw(int amount){ //출금 
		int retValue=0; //변수를 안쓰면 return문이 if와 else 둘다 나와야함
		if(balance>=amount) {
			retValue=amount;
			balance-=amount;
		}else {
			retValue=0;
		}
		return retValue; // retValue=0;
	}	

	public void getInformation() {
		System.out.println("현재 "+accOwner+"님의 잔고는 "+balance+"원 입니다.");
	}
}


