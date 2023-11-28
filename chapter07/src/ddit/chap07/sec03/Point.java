package ddit.chap07.sec03;

public class Point {
	int x;
	int y;
	
	public Point() { //원점
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String getLocation() {
		return "(x,y)=("+x+","+y+")";//문자열로 리턴
		//(x,y) 출력
	}
	
}
