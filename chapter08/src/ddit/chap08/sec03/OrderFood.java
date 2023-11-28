package ddit.chap08.sec03;

public class OrderFood {

	public static void main(String[] args) {
		Owner owner=new Owner();
		owner.giveFood(new CustomerA());
		owner.giveFood(new CustomerB());
	}

}

class Owner{
	void giveFood(Customer cust) {
		System.out.println(cust.getOrder());
	}
}