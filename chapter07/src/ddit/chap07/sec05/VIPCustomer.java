package ddit.chap07.sec05;

public class VIPCustomer extends Customer {
	private int agentID; //담당자 id
	private double saleRatio;
	
	public VIPCustomer(){}
	public VIPCustomer(int custID, String custName, int agentID) {
		super(custID,custName);
		custGrade="VIP";
		bonusPointRatio=0.3;
		saleRatio=0.3;
		this.agentID=agentID;
	}
	
	@Override
	int calcPrice(int price) {
		bonusPoint+=(price*bonusPointRatio);
		return price - (int)(price*saleRatio);
	}
		
	@Override
	public String toString() {
		return custName+"님의 등급은 "+custGrade+"이고, 보너스포인트는 "
				+bonusPointRatio+"입니다.\n담당 사원번호는 "+agentID+"입니다.";
	
	}
}
