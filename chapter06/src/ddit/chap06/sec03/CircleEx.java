package ddit.chap06.sec03;

public class CircleEx {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.printInfo();

		Circle c2=new Circle(500, 200, 150.8);
		c2.printInfo();
	}

}

class Circle{
	private int x=50;
	private int y=50;
	private double radius=15.5;
	
	{ //초기화 블록; 클래스 필드 초기명령의 모임 => 첫번째 초기화 실행
		System.out.println("("+x+", "+y+")"+"반지름 : "+radius);
		x=100;
		y=200;
		radius=20;
		System.out.println("("+x+", "+y+")"+"반지름 : "+radius);
	}
	
	Circle(){
		this(0,0,0d); //0d double 타입의 0
		x=0;
		y=0;
		radius=0;
	}
		
	Circle(int x, int y, double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	void printInfo() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("radius="+radius);
	}
	
	
}
