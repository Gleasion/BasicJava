package ddit.chap07.point.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height, int x, int y) {
		super(x,y); //public Point(int x, int y) {} 이거 불러옴
		this.width=width;
		this.height=height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")"
				+"width="+width+"\nheight="+height;
	}
	
	
	
	
}
