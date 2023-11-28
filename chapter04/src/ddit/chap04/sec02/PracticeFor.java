package ddit.chap04.sec02;

public class PracticeFor {

	public static void main(String[] args) {
		// 2*1=2	3*1=3	4*1=4	5*1=5
		// 2*2=4	3*2=6	4*2=8	5*2=10
		// ...
		//9까지 곱하여 출력,,	
		//method1();
		method2();
	}

	public static void method1() {
		for(int i=1; i<+5; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(j+"*"+i+"="+(i*j));
			}
			System.out.println();
		}
	}
	
	public static void method2() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"."+j);
			}
			System.out.println();
		}
	}
	
}
		