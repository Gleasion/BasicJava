package ddit.chap05.sec01;

public class ReferenceType {

	public static void main(String[] args) { //main method가 있는 것에만 public
		method1();
		//method2();

		//Customers cus=new Customers("홍길동");
		//System.out.println(); //주소출력
		//System.out.println(cus); //번지 출력
		
	}	

	public static void method1() {
	String str1="정몽주"; 
	String str2="정몽주";
	System.out.println("str1의 주소="+System.identityHashCode(str1));
	System.out.println("str2의 주소="+System.identityHashCode(str2));
	str2=str2+"홍길동";
	System.out.println(str2);
	System.out.println("str2의 주소="+System.identityHashCode(str2));
	String str3="정몽주";
	System.out.println("str3의 주소="+System.identityHashCode(str3));
	//new 연산자를 쓰지 않은 String 객체의 경우 주소 값,,,
	//identityHashCode() 절대주소 값
	System.out.println(str1); //.toString()이 생략되어졌음 주소비교
	System.out.println(str1.toString());
	System.out.println(str1==str3); //주소비교
	System.out.println(str1==str2);
	System.out.println(str1.equals(str3)); //.equals() 내용 비교
	System.out.println(str3);
	
	
	}
	
	public static void method2() {
		String str1=new String("정몽주");
		System.out.println(str1);
		String str2=new String("정몽주");
		String str3=new String("정몽주");
		System.out.println("str1의 주소="+System.identityHashCode(str1));
		System.out.println("str2의 주소="+System.identityHashCode(str2));
		System.out.println("str3의 주소="+System.identityHashCode(str3));
		//new 연산자를 사용하면 heap 영역에 서로 다른 주소값을 지니는 별도의 저장공간에 저장
		
	}
	
}
	class Customers{ //public을 붙일 수 없음, 붙이려면 별도의 워크시트 생성하면 됨
		String name;
		
		public Customers() {} // 기본 생성자
		public Customers(String name) { //일반생성자 (매게변수)
			this.name=name; //overoading 한 클래스 내에서 이름이 같은 method가 또 쓰일 수 있음
			//overiding 재정의 상속받는 class로 내용이 다름 -> 다양한 기능을 처리함
			//overoading 한 클래스 내에서 이름이 같은 -> 다양한 데이터를 취급하기 위한 목적
		}
		
		@Override //comfile되어지는 주석(실행에 관여되어지는 주석) //어노테이션
		public String toString() { //String class에도 toString 정보 재정의 되어있음
			return this.name;
			
		}
	}

