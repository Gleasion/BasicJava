package ddit.chap06.sec01;

public class StudentExample {

	public static void main(String[] args) {
		//다음 조건에 맞는 학생 클래스를 설계하시오.
		//속성: 학번(long), 이름(String)
		//메서드: 정보(학번과 이름) 출력

		Student s1=new Student(); //생성자 메서드 //default constructor 기본생성자
		// s1실행 = Null값 저장
		// new실행 = StuId=0저장, name=Null값 저장
		// Student() 코드없어서 그대로 저장
		// =실행 =s1에 stuId 주소값 저장
		Student s2=new Student();
		s1.stuId=202301001;
		s2.stuId=202005030;
		s1.name="정몽주";
		s2.name="홍길동";
				
		s1.getInfo(); //void 타입이라 그냥 부름
		s2.getInfo();
	}

}


class Student{ //생성자 기술 안하면 컴파일러가 만들어줌
	long stuId;
	String name;
	
	public void getInfo() {
		System.out.println("학번 : "+stuId);
		System.out.println("이름 : "+name);
 }
	
	
	
}