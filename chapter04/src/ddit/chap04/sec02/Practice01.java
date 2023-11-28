package ddit.chap04.sec02;

public class Practice01 {

	public static void main(String[] args) {
		//

		practice1();
		practice2();
		
		
	}

	public static void practice1() {
		// 문제1. 1-50사이의 수에서 피보나치 수열을 찿아 인쇄하시오.
		// Fibonacci 수 : 첫 번째수와 두 번째 수가 1과 1로 주어지고 그 다음 수부터는 전 두 수의 합이 현재 수가 되는 수열
        // 1, 1, 2, 3, 5,....
		
		int a=0;
		int b=1;
		int fib=1;
		
		System.out.print("1부터 50사이의 파보나치 수열= ");
		for(; fib<50;) {
			System.out.print(fib+" ");
			fib=a+b;
			a=b;
			b=fib;
			
		}
					
		
	}
	
	public static void practice2() {
		// 문제 2. 두 개의 주사위를 던졌을때 두 눈의 합이 6이되는 조합을 출력하시오..
		
		System.out.println("두 눈의 합이 6이 되는 조합 :");
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println(i+", "+j);
				}
			}
		}
		
		
		
	}
	
}
