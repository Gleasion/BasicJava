package ddit.chap06.sec04;

public class Shape01 {
	String kind;
	int width;
	int height;
	
	public Shape01(String kind, int width, int height) {
		this.kind=kind;
		this.width=width;
		this.height=height;
	}

	public double triArea(int width, int height) {
		double area=width*height/2;
		return area;
	}
	
	public double SquArea(int width, int height) {
		double area=width*height;
		return area;
	}
		
	public void printArea() {
		double area;
		if(kind.equals("삼각형")) {
			area=triArea(this.width, this.height);
		}else {
			area=SquArea(this.width, this.height);
		}
		System.out.println(area);
	}
}
