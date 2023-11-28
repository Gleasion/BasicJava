package ddit.chap07.sec03;

public class Triangle extends Shape{
	Point[] p=new Point[3]; //배열 메모리만 생성, 개체 생성X
	//개체: Point class type
	//[]의 메모리에는 주소값들어감
	
	public Triangle() {}
	
	public Triangle(Point[] p) {
		this.p=p;
	}
	
	@Override
	public void draw() {
		System.out.printf("[p1 : %s, p2 : %s, p3 :%s]\n",  //문자열 형식
				p[0].getLocation(),p[1].getLocation(),p[2].getLocation()); //프린트 내용
	}
	
}
