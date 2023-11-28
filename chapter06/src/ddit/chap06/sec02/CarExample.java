package ddit.chap06.sec02;

public class CarExample {

	public static void main(String[] args) {
//		1. 두개의 필드인 제조회사와 기어타입(자동.수동)을 각각 문자열과 논리타입으로 설정하며,
//		외부에서 각 필드값을 입력 받아 값을 설정하는 메서드와 정보를 출력하는 메서드를 가진 Car 클래스와 이를 실행하는 CarExample 클래스를 설계하시오.
//
//		속성: 제조회사, 기어타입(자동/수동) 문자열(String)과 논리타입(boolean)
//		메서드: 외부에서 필드값 입력받아(setInfo) 값 설정, 정보출력(getInfo)
		
		Car c1=new Car();
		c1.setCompany("대우자동차");
		c1.setGearType(true); 
		c1.showInfo();
		
		System.out.println(c1);
	}

}
