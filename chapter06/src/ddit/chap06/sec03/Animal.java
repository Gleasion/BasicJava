package ddit.chap06.sec03;

public class Animal {

	String name;
	
	//멤버필드 초기화
	public Animal() {};//다른 클래스에서 사용할 거라서 public 
	
	public Animal(String name){ //Overloading
		this.name=name;
	}
	
	void printInfo() {
		System.out.println("이름: "+name);
	}
	
	
}
