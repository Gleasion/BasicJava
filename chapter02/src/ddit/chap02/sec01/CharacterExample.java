package ddit.chap02.sec01;

public class CharacterExample {

	public static void main(String[] args) throws Exception{ //throws Exception : 예외처리
		// char : 부호 없는 2 byte(0~65535)
		// ' '안에 표현된 한 글자 취급
		// ACSII 코드로 변환 저장
		// null 표현을 할 수 없음(''사용할 수 없음) -> white space 표현 방법 없음
		// 초기화 시킬 때에는 공백을 초기값으로 설정해야함
		// 공백 : 40 (아스키코드)
		// D : 68 (아스키코드)
		// d : 100 (아스키코드)
		// Enter : 13
		
		method1();
		//method2();
		
	}
	
		public static void method1() throws Exception{
		char var1 = 'A'; // char은 문자 하나만 출력
		int var2='A'; // int은 유니코드로 전부 출력
		System.out.println(var1);
		System.out.println(var2);
		
		System.out.print("글자 하나를 입력 : "); //ln:줄바꿈
		int ch = System.in.read();
		//System.in.read();	쓰려면 오류처리 해줘야함 throws Exception
		//System: s static, f final
		//string 객체: in(입력), out(출력), err(에러출력)
		//in. -> 나올수 있는 method
		//ex).read() : int -> inputSream 
		System.out.println(ch); 
		System.out.println((char)ch); //강제형변환 char은 문자로 앞글자 하나만
		}
		
		public static void method2() {
		byte b=100;
		char c=(char)b; // char 값은 음수 표현 강제 형변환 해주어야함
		//int c=b;
		System.out.println(c);

	}

}
