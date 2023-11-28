package ddit.chap07.point.controller;

import ddit.chap07.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r=new Rectangle(20,50,100,200); //vo클래스에 들어있음 -> import
	
	public String getArea() {
		int area=r.getWidth()*r.getHeight();
		
		return "원점 : ("+r.getX()+","+r.getY()+")"
				+"\n면적 : "+area;
	}	
		
	public String getPerimeter() {
		int Perimeter=r.getWidth()*r.getHeight();
			
		return "원점 : ("+r.getX()+","+r.getY()+")"+r.toString()
				+"\n둘레 : "+Perimeter;
	}
	
	
	

}
