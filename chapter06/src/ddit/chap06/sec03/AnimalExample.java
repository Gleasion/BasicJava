package ddit.chap06.sec03;

public class AnimalExample {

	public static void main(String[] args) {
		//예제: 문자열 타입의 이름(name)필드를 가진 Animal 클래스를 생성하고 다음 자료를 할당하여
		// 이름을 출력하도록 클래스를 생성하시오.

		Animal a1=new Animal("강아지");
		a1.printInfo();
		
		Animal a2=new Animal("고양이");
		a2.printInfo();
		
	}

}

