package ddit.chap06.sec04;

public class Shape {
	int width;
	int height;
	double area;
	int kind;
	
	public Shape() {}
	
	public Shape(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public void getArea(int kind) {
		this.kind=kind;
	}
	
	public void printArea() {
		if(kind==3) {
			area=(width*height)/2;
			System.out.print("삼각형의 넓이는 : ");
		}else if(kind==4){
			area=width*height;
			System.out.print("사각형의 넓이는 : ");
		}else {
			System.out.print("3과 4로 입력하시오.");
		}
		System.out.println(area);
		
	}
	
}