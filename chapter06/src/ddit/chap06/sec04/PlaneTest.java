package ddit.chap06.sec04;

public class PlaneTest {

	public static void main(String[] args) {
		//제조사(manufacture), 모델명(model), 최대승객수(maxNumberOfPassenger), 생산된 비행기 수(numberOfPalnes) 맴버 변수와
		//생성자 매서드 각 변수의 값을 변경하는 매서드, 각변수의 값을 반환받는 매서드
		//전체 정보를 출력하는 매서드를 갖는 클래스(Plane)와 이를 실행하는
		//클래스(PlaneTest)를 생성하시오.
			
		Plane p1=new Plane();
		System.out.println(p1);
		Plane p2=new Plane();
		System.out.println(p2);
		
		Plane p3=new Plane("현대", "A1", 300);
		System.out.println(p3);
		
		p1.setModel("AA11");
		System.out.println(p1);
		
	}

}
