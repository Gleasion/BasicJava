package ddit.chap07.sec01;

public class StudentExample {

	public static void main(String[] args) {
		People p1=new People("홍길동","남성");
		System.out.println("이름 : "+p1.name);
		System.out.println("성별 : "+p1.gender);
		
		
		Student s1=new Student("정몽순","여성",202301);
		System.out.println("학번 : "+s1.stdID);
		System.out.println("이름 : "+s1.name);
		System.out.println("성별 : "+s1.gender);

	}

}
