package ddit.chap02.sec02;

public class PromotionExample {

	public static void main(String[] args) {
		// 자바의 형변환
		// 1. 자동 변환  - promotion
		//	표현의 범위가 큰 쪽의 타입으로 자동 변환
		// byte<short<int<long<float<double
		// 연산에서 사용된 자료의 타입이 int보다 작은 경우 byte, short, char => int 타입으로 promotion
		//

		int i=0;
		long val1=10000L;
		float val2=3.14f;
		
		float res1=val1*val2+i;
		System.out.println(res1);
		
		char ch1='가';
		char ch2='힣';
		System.out.println(ch1+0); //ascii코드로 변환
		System.out.println(ch2+0);
		System.out.println(ch2-ch1+1);
		
//		i=i+ch;
//		System.out.println(i);
		
		
	
		
		
		
		
	}

}
