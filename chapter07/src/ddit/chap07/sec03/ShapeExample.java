package ddit.chap07.sec03;

public class ShapeExample {

	public static void main(String[] args) {
	
		Circle c1=new Circle();
		c1.draw();
		
		Circle c2=new Circle(new Point(200,300),150);
		c2.draw();

		Point[] p = {new Point(100,200), new Point(500,200), new Point(500,700)};
		Triangle t=new Triangle(p);
		t.draw();
		
	}

}
