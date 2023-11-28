package ddit.chap06.sec02;

public class CircleExample {

	public static void main(String[] args) {
		Circle c1=new Circle();
		Circle c2=new Circle(25);
		c1=c2; //c1 garbage collector 대상 링크없어짐,,
		c1.getArea();
		
	}
}