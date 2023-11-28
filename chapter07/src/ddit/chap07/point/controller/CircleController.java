package ddit.chap07.point.controller;

import ddit.chap07.point.model.vo.Circle;

public class CircleController {
	private Circle c=new Circle(); //vo클래스에 들어있음
	
	public String getArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area= c.getRadius()*c.getRadius()*3.1451926; //또는 radius*radius*3.14
		
		return "원점 : "+c.toString()+"\n면적 : "+area;		
	}
	
	public String getCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum=radius*2*3.1451926;
		return "원점 : "+c.toString()+"\n둘레 : "+circum;
	}
	
}

