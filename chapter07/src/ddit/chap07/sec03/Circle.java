package ddit.chap07.sec03;

public class Circle extends Shape{
	int radius;
	Point center; //타입이 Point
	
	
	public Circle() {
		// Point center=new Point(); 받는놈=주는놈 안됨
		this(new Point(),100); //무조건 첫번째 줄
	}
	
	public Circle(Point center, int radius) {
		this.center=center;
		this.radius=radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("[center : %s radius=%d color=%s]\n", //문자열 형식
				center.getLocation(), radius, color); //프린트 내용
		
	}
	//문자 s 실수d
	
	
	
	
	
	
}

