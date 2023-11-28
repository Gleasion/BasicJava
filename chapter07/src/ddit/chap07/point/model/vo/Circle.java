package ddit.chap07.point.model.vo;

public class Circle extends Point {
	private int radius;
	
	public Circle() {} //super(); 즉, public Point() {} 생략되었음
	
	public Circle(int radius) {
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+"), radius : "+radius;
	}
	
	
}
