package ddit.chap02.sec02;

public class CastExample3 {

	public static void main(String[] args) {

	//method1();
	method2();
	//method3();
	//method4();
	//method5();
	
	}
		
// 53p 손코딩	
	public static void method1() {
		int x = 3; int y = 5;
		System.out.println("x:"+x+", y:"+y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:"+x+", y:"+y);
}

// 58p 손코딩	
	public static void method2() {
		int v1 = 0;
		if(true) {
			int v2 = 0;
			if(true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
				v1 = v2 + v3;
			}
		}
		System.out.println(v1);
	}	
	
	
	public static void method3() {
		// 1년 365.2422일
		// Q. 1년은 "365일 00시간 00분 00초"로 출력되도록 프로그램하시오.
		
		

		// 0.2422일*24시간 = 5.8128 -> 5시간 0.8128분
		// 0.8128분*60분 = 48.748 -> 48분 0.768초
		// 0.768초*60초 = 46.08 -> 46초
				
		int date = 365;
		int hour = 5;
		int minute = 48;
		int second = 46;
		
		System.out.println(date+"일 "+hour+"시간 "+minute+"분 "+second+"초");
	}
	
	
	
	public static void method4() {
//		1년: 365일
//		1일: 24시간
//		1시간: 60분
//		1분: 60초
		
		double d1 = 365.2422;
		int date = (int)d1;
		
		double h1 = (d1-date)*24;
		int hour = (int)h1;
		
		double m1 = (h1-hour)*60;
		int minute = (int)m1;
		
		double s1 = (m1-minute)*60;
		int second = (int)s1;
		
		System.out.println(date+"일 "+hour+"시간 "+minute+"분 "+second+"초");
	}
	
	
// 수업
	public static void method5() {
		double year=365.2422;
		int days=(int)year; //->365
		
		double hours=(year-days)*24;
		int hour=(int)hours; //->5
				
		double minutes=(hours-hour)*60;
		int minute=(int)minutes;
		
		double seconds=(minutes-minute)*60;
		int second=(int)seconds;
		
		System.out.println("1년은 "+days+"일 "+hour+"시간 "+minute+"분 "+second+"초");
	}
		
		
}	
		
		
		

