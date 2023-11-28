package ddit.chap06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		//학번(stdId) 이름(name) 전화번호(telNo)를 필드로 가진 학생(Student) 클래스를 생성하고
		//초기화(생성자) 및 전화번호를 갱신(setTelNo)하는 메서드와 정보를 출력(toString)하는 메서드 작성

		Student s1=new Student(202304002,"정몽주","010-1243-1234");
		System.out.println(s1.toString()); //return value가 String 타입임
		System.out.println(s1); //.toString() 생략 되어진것으로 판단
		//.toString()가 없어도 출력가능(주소값)
		//Override 사용하면 주소값이 아닌 내용을 출력할 수 있도록 재정의되어짐
		
		s1.setTelNo("010-0987-1234");
		System.out.println(s1);
		
		s1.setTelNo("010-0987-1234");
		String res=s1.toString();
		System.out.println(res);
		
		
	}

}
