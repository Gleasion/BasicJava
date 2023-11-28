package ddit.chap02.sec01;

public class FloatingNumber {

	public static void main(String[] args) {
		//float: 4byte(1bit:부호, 8bit:지수, 23bit:가수): 소수점을 가지고 있는 수
		// 1.4E-45 ~ 3.4E+38 
		// 데이터 끝에 반드시 F or f 추가해야함
		
		//double type: 8byte(1bit:부호, 11bit:지수, 52bit:가수):소수점을 가지고 있는 수
		// 기본 실수형
		// 1.9E-324 ~ 1.8E+308
		
		float f=0.1f;
		double d=0.1;
		if(f==d) { //변환오차가 나옴
			System.out.println("같은 값");	
		}else {
			System.out.println("다른 값");
			
		}
		
		d=f; //f를 d로해라
		System.out.println(d); //변환오차 값
		
		
	}

}
