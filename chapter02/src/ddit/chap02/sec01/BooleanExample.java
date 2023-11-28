package ddit.chap02.sec01;

public class BooleanExample {

	public static void main(String[] args) throws Exception{
	
		//method1();
		method2();
	}
	
	 public static void method1(){
		// boolean: 1byte 논리(true, false)
		// 다른 타입으로 형변환 할 수 없음
		// 조건식에 주로 사용
		
		boolean b=50>35;
		System.out.println("b="+b); // true 값
		
		while(true) { //toggle 기능 : ture, false를 계속해서 반복해서 사용 ex)한/영 key, alt key
			boolean flag=!b;
			b=flag;
			System.out.print(flag);
			break;
		}
	 }
	
	public static void method2() throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: "+keyCode);
			
			if(keyCode==5) {
				break;
			}
		
			System.out.println("종료");
		}
		
	}

}