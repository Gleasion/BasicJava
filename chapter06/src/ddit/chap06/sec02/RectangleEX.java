package ddit.chap06.sec02;

public class RectangleEX {
	
	public static void main(String[] args) { //args 메게변수
		Rectangle r1=new Rectangle();
		//r1.height=10; //private에 막혀 있어 접근 불가,,,
		r1.setHeight(10);
		r1.setWidth(20);
		
		// -> 생성자 method 사용, getter/setter(args매게변수 있음, 반환값-void 데이터 있어야함) 사용
		//get 꺼내오는 클래스,,
		//r1.width=20;
		
		int res=r1.getArea();
		System.out.println(r1.getArea());
	
	
	}
	

}

class Rectangle{ //맴버변수
	private int height; //private 자기가 속한 class 안에서만 사용 가능 외부에서 접근 불가능
	private int width;
	
	void setHeight(int height) { //지역변수는 지역안에서 왕임
		this.height=height; //this 특수목적의 참조형 변수: 자기자신의 주소값, 멤버변수와 지역변수의 이름이 같을 때 멤버변수를 나타냄
	}
	
	void setWidth(int width) { 
		this.width=width;
	}
	
	int getArea() {
		return height*width;
	}
}
