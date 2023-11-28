package ddit.chap07.sec05;

public class Customer {
	protected int custID;
	protected String custName;
	protected String custGrade;
	int bonusPoint;
	protected double bonusPointRatio;
	
	public Customer() {
		init();
	}
	
	public Customer(int custID, String custName) {
		this.custID=custID;
		this.custName=custName;
		init();
	}

	void init() {
		this.custGrade="SILVER";
		this.bonusPointRatio=0.01;
	}
	
	int calcPrice(int price) {//지불금액 계산
		bonusPoint+=(price*bonusPointRatio);
		return price;
	}
	
	@Override
	public String toString() {
		return custName+"님의 등급은 "+custGrade+"이고, 보너스포인트는 "
				+bonusPointRatio+"입니다.";
	}
	
	
}

