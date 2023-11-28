package ddit.chap06.sec02;

public class Circle {

		int radius=10;
		final double PI=3.1415926; //상수 

		public void getArea() {
			double area=PI*radius*radius;
			System.out.println("넓이 : "+area);
		}
		
		public Circle(int radius) {
			this.radius=radius;
		}
		
		public Circle() {}
		
	

}