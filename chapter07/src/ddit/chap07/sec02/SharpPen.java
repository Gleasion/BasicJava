package ddit.chap07.sec02;

public class SharpPen extends Pen {
	private double width;
	
	public SharpPen() {}
	
	public SharpPen(int amount, double width) {
		super(amount);
		this.width=width;
	}

	public double getWidth() { //private으로 설정해서 필요함
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
}
