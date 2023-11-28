package ddit.chap08.sec02;

public class OrderFood {

	public static void main(String[] args) {
		ResOwner owner=new ResOwner();
		Customer cust=new CustomerA("홍길동");
		owner.giveFood(cust);
		
		cust=new CustomerB("이순신");
		owner.giveFood(cust);
	}

}
