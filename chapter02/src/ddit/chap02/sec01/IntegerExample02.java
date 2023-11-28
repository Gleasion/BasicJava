package ddit.chap02.sec01;

public class IntegerExample02 {
	
	//메인메소드
	public static void main(String[] args) { 
		
		//mehtod1();
		//mehtod2();
//		mehtod3();
		mehtod4();
	}
		
	public static void mehtod1() {
		// 수업	
		// int : 기본정수 타입
		// 4byte : -2147483648 ~ 2147483647
		
		int var1=0b1011; // 2진수
		int var2=0206; // 8진수
		int var3=365; // 10진수
		int var4=0xB3; //16진수
		
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
	}
			
	public static void mehtod2() {
		//무조건 수식에서 int보다 작은타입(byte,short,char(1글자 저장))는 자동적으로 int로 형변환
		
		byte b1=100;
		short s1=200;
		int res=b1+s1; //s1=b1+s1; 안됨
		s1=(short)(res); //(short)로 (b1+s1)을 강제형변환
		System.out.println(s1);
	}

	public static void mehtod3() {
		// long
		// 8byte : -2^63 ~ (2^63)-1
		// 데이터 끝에 L(l) 필수 표기
		
		long val1=1000000000000000L; //1,000,000,000,000,000
		System.out.println(val1);
	}
		
	
	//클래스를 통해서 c1, c2라는 객체를 생성
	public static void mehtod4() {
		String c;
		
		//Customer라는 클래스를 통해 c1 객체를 생성 시 두 개의 파라미터가 필요
		System.out.println("개똥이1");
		//new : 생성자
		Customer c1 = new Customer();
		
//		c1.print1(); //(x)
		c1.print2();
		
		System.out.println("개똥이2");
		//System.out.println(ID + ", " + password);
		Customer c2 = new Customer("a001","java");
		// new 집이 지어지는 장소, 뒤에 Customer 부름
		System.out.println("개똥이3");
//		System.out.println(ID+", "+password);
//		System.out.println(pid+", "+passwd);
	}

	void mymethod5() { //Method를 벗어나면 변수 생존 불가능

		int sum=0;
		for(int i=0; i<100; i++) {
			sum=sum+i;
		}
		
		System.out.println("합="+sum);
		//System.out.println("마지막 i값="+i);//i 참조 불가능
	}
	
}	
		
//클래스 IntegerExample02
//클래스
//멤버변수 : ID, password
//생성자(Constructor)
class Customer {
	String ID; // 멤버변수, method와 동급, int 변수
	 String password; // 멤버변수, 자동 초기화 Null값, 생성지점=소멸지점
	 
	//기본 생성자
	public Customer() {}

	//생성 Method는 대문자로 작성
	 Customer(String pid, String passwd){ 
		//Method 안쪽 지역변수, 지역변수 호출 시 지역변수
		this.ID=pid;
		this.password=passwd;
		
		System.out.println(ID + ", " + password);
	}
	//접근제한자 : 이 클래스에서만 접근 가능
	private void print1() {
		System.out.println("접근제한자 : 이 클래스에서만 접근 가능");
	}
	
	//접근제한자 : 이 프로젝트에서 접근 가능
	public void print2() {
		System.out.println("접근제한자 : 이 프로젝트에서 접근 가능");
	}
}//end class

	
