package ddit.chap06.sec01;

public class HomeworkCircle{
	int radius;
	double area;
	double length;
	
	public void PracitceCirlce(int radius) {
		this.radius=0;
		this.area=0;
		this.length=0;
	}
	
	public void Area(int radius){
		double area=radius*radius*3.14;
		System.out.println("넓이 : "+area);
	}
	
	public void Length(int radius){
		double length=2*radius*3.14;
		System.out.println("둘레는 : "+length);
	}
	
}
