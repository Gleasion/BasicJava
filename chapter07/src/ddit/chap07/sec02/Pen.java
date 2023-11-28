package ddit.chap07.sec02;

public class Pen {
	
	private int amount;//private은 직접 상속 안됨, 외부에서 직접접근/변경 금지
	//-> private으로 사용하고 외부에서 사용하고 싶으면 get/set메소드를 이용해야함
	//protected int amount; 완됨
	
	public Pen(){}
	
	public Pen(int amount) {
		this.amount=amount;
	}

	public int getAmount() { 
		return amount;
	}

	public void setAmount(int amount) { 
		this.amount=amount;
	}
		
}
