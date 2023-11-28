package ddit.chap07.sec05;

public class GoldCustomer extends Customer{
	private double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(int custID, String custName) {
		super(custID,custName);
		custGrade="Gold";
		bonusPointRatio=0.1;
		saleRatio=0.1;
	}
	
	@Override
	int calcPrice(int price) {
		bonusPoint+=(price*bonusPointRatio);
		return price - (int)(price*saleRatio);
	}
		
	@Override
	public String toString() {
		return custName+"님의 등급은 "+custGrade+"이고, 보너스포인트는 "
				+bonusPointRatio+"입니다.";
	
	}
}
