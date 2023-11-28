package ddit.chap02.sec02;

public class CastExample1 {

	public static void main(String[] args) {
		// cast: 강제 형변 -> 형변환 연산자 (타입)000 사용
		
		method1();
		method2();
		
	}
		
		public static void method1() {
			//난수(random number) 발일정한 구간에 발생되어 지는 값을 예상하지 못함
			//mass.random(): 0.0<=Math.random()<1.0 사이의 double형 난수
			//.random class
			
		double rnd=Math.random();
		System.out.println(rnd);
		
		int num=(int)rnd;
		System.out.println(rnd);
		System.out.println(num);
		
		}
		
		public static void method2() {
			//범위를 지정한 정수형 난수
			//(a부터 b)사이의 난수(a<b인 경우)
			//공식: (int)(Math.random()*(b-a))+a
			
		//1부터 45 사이의 난수 6개
			double rnd=Math.random();
			
			for(int i=1; i<=6; i++) {
				int num=(int)(Math.random()*44)+1;
				System.out.print(num+"\t");
			}
		}
		
// 0.0 <=Math.random()*100<1.0
//(int)~
// 0<=r<=99
// 1<=r+1<=100		

}
