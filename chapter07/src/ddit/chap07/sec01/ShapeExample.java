package ddit.chap07.sec01;

public class ShapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle s1=new Rectangle(20,15);
		System.out.println("사각형 면적 : "+s1.getArea()); //부모클래스에 있는 getArea 상속
		
		Triangle s2=new Triangle(20,15);
		System.out.println("삼각형 면적 : "+s2.getArea()); //자식클래스에 있는 재정의된 getArea 상속
	}

}
