package ddit.chap07.sec01;

public class Shape {
	int height;
	int width;
	
	public Shape() {}
	
	public Shape(int height, int width) {
		this.height=height;
		this.width=width;
	}
	
	public int getArea() {
		return height*width;
	}
	
}
