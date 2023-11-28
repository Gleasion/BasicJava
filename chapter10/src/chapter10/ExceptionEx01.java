package chapter10;

public class ExceptionEx01 {
	static Person p;
	public static void main(String[] args) {
		String str=null;
		Person p=null;
		
	//	System.out.println(str.toString()); 해당 참조명.Method명 쓸 때 오류
		System.out.println(str); // default의 경우에는 문제 없음
		System.out.println(p);  //.사용안해도 아직 객체가 없어 오류이지만 위에 person p가 있어 실행됨
		System.out.println(p.toString()); // .사용안해도 아직 객체가 없어 오류
		
	}

}

class Person{}