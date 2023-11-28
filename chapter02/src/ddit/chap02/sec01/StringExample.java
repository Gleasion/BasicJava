package ddit.chap02.sec01;

public class StringExample {

	public static void main(String[] args) {
		// String: 문자열을 취급하는 클래스 * 클래스도 Data type의 일부
		// 문자열은 " "안에 표현
		// 객체 생성에 2가지 방법 존재 ex) new 없이 객체 생성되는 것은 String만,,,
		// 일반적 객체 생성(new 연산자 사용)
		// 클래스명 변수명 = new 클래스명([매게변수]); <-생성자 메서드 -> heap에 저장
		// 생성자 메서드: 객체 초기화
		// Heap Memory : new에 의해 확보되어지는 영역
		// String Class의 경우 new연산자 없이 객체생성 가능 -> literal pool에 저장
		
		// index, array 변수가 정해져있음
		// 변수 개량 : 배열
		// 배열 단점 1. 같은 Data type만 취급해야함 *C언어는 구조체로 다른 타입을 묶어 사용 할 수 있음
											//Data만 있고 행동 없음
											//-> class로 함 Method
		//		  2. 한번 마련해두면 절대로 늘이거나 줄일 수 없음
		// java에서 배열 단점 해결함

		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString());
		//원래는  절대주소 값이 출력되어야 함 ->나중에
		System.out.println(str2); //.toString() 생략
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1==str2);
		//== 참조형 변수는 객체 주소 비교됨
		System.out.println(str1.equals(str2));
		//equals는 내용(문자열 비교
		System.out.println("str1의 절대주소: " +System.identityHashCode(str1));
		System.out.println("str2의 절대주소: " +System.identityHashCode(str2));
		
		
		String str3=new String("홍길동");
		String str4=new String("홍길동");
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3==str4); //주소비교
		System.out.println(str3.equals(str4)); //내용비교
		System.out.println("str3의 절대주소: " +System.identityHashCode(str3));
		System.out.println("str4의 절대주소: " +System.identityHashCode(str4));
		

		//내용 더 있는지 확인해보기
		
		
	}

}
