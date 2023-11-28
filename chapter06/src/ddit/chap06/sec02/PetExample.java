package ddit.chap06.sec02;

public class PetExample {

	public static void main(String[] args) {
		//애완동물의 종류와 나이를 보관하는 멤버필드와 애완동물의 정보를 출력하는 메서드를 설계

		Pet p1=new Pet();
		p1.kind="거북이";
		p1.age=7;
		
		
		System.out.println(p1);//.toString 생략
	}
}

class Pet {
	String kind;
	int age;
	
	@Override //외워야함. 글자 변경하면 안됨
	//Override 주소가 아니라 내용을 출력하게 해줌
	public String toString() { 
		return "애완 종류 : "+kind+"\n나이 : "+age; //출력하고 싶은 내용을 적어줌
	}

}
