package ddit.chap07.sec01;

public class Triangle extends Shape{
	
	public Triangle() {}
	
	public Triangle(int height, int width) {
		super(height, width);
		
	}
	
	@Override
	public int getArea() {
		return (height*width)/2;
	}

}
