package ddit.chap08.sec02;

public abstract class Customer {
	protected String custName;
	
	public Customer() {}
	public Customer(String custName) {
		this.custName=custName;
		
	}
	
	public void setCustName(String custName) {
		this.custName=custName;
	}
	
	public abstract String getName();
	
//	@Override
//	public String toString() {
//		return custName;
//	}
}

class CustomerA extends Customer{
	CustomerA(String custName){
		super(custName);
	}

	@Override
	public String getName() {
		return custName;
	}
	
}

class CustomerB extends Customer{
	CustomerB(String custName){
		super(custName);
	}

	@Override
	public String getName() {
		return custName;
	}
	
}

class ResOwner{
	public void giveFood(Customer cust) {
		System.out.println(cust.getName()+" 손님에게 김치찌게를 제공합니다.");
	}
	
}