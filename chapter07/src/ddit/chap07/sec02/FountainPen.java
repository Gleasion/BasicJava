package ddit.chap07.sec02;

public class FountainPen extends BallPen {
	private int amt;//속성이 아니여서
	private String color;
	
	public FountainPen(){};
	
	//public FountainPen(String color) {
	//	this.color=color;
	//}
	
	public FountainPen(int amount, String color) {
		super(amount, color);	
	}
	
	public int refill(int amt) {
		setAmount(amt+getAmount());
		return amt+getAmount();
		//System.out.println("남은 잉크량 : "+setAmount(amt+getAmount()));// set메서드가 반환이 안돼서 출력 안됨
	}
	
//	public void reFill(int amt) {
//		this.amt=amt+getAmount();
//	}
//	
//	public int getRefill(int amt) {
//		return amt;
//	}
	
	@Override //볼펜에도 있어서 재정의해서 만년필도 쓰고 싶음
	public void setColor(String color) { //만년필 컬러
		this.color = color;
	}
	
	@Override //볼펜에도 있어서 재정의해서 만년필도 쓰고 싶음
	public String getColor() { //만년필 컬러 반환
		return color;
	}

	public String parentColor() { //볼펜의 색상 반환
		return super.getColor();
	}
	
}
