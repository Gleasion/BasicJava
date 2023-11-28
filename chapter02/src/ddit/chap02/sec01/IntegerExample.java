package ddit.chap02.sec01;

public class IntegerExample {
	
	public static void main(String[] args) {
 
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
		method6();
		
	}
	
	public static void method1() {
		int value=10;
		int result=value+10;
		System.out.println(result);
	}
		
		
		
	public static void method2() {
		byte var1=-128;
		byte var2=-30;
		byte var3=0;
		byte var4=30;
		byte var5=127;
		var5++;
		
		//byte var6=128;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		//System.out.println(var6);
		
	}

		
//수업		
// byte type
// 1byte: (-128 ~ 127)
// byte b=128 -> 저장 불가능
// byte b=127;
// b++; -> 저장가능
								
		
	public static void method3() {
		byte b=20;
		System.out.println("b="+b);
	}
		
	public static void method4() {
		byte b=20;
		b+=2;
		System.out.println("b="+b);
		System.out.println("b="+(b+10));
	}
		
	public static void method5() {
		byte b=20;
		int res; // byte res; 안됨
		res = b+10;
		System.out.println(res);
	}
		
// short
// 2byte : -32768 ~ 32767
	
	public static void method6() {
		short sh=100;
		System.out.println("sh="+sh);
		System.out.println("sh+50="+(sh+50));
		
		int res=sh+50; //short res=sh+50;
		System.out.println(res);
	}	
		
}
	

