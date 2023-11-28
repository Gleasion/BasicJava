package ddit.chap03.sec01;

public class ShiftOperator {

	public static void main(String[] args) {
		// shift 연산자 : >>(right shift), <<(left shift),>>>(right rotate)
		// 사용형식 : 변수 shift연산자 숫자(정수)
		
		method1();
		//method2();
		//method3();
		
	}
	
		public static void method1() {
		// 1. >>(right shift) : '변수'의 값을 '숫자'의 값으로 나눈 몫
		// '변수'의 값을 2^'숫자'만큼 오른쪽으로 이동
		// 부호비트는 이동하지 않으며,발생된 왼쪽 빈공간은 부호비트가 확장함
		
		int num=15;
		System.out.println(num>>2);
	}
		
		
		public static void method2() {
		// 2. <<(left shift) : '변수'의 값을 '숫자'의 값으로 곱한 몫
		// '변수'의 값을 2^'숫자'만큼 오른쪽으로 이동
		// 부호비트는 이동하지 않으며,발생된 오른쪽 빈공간은 0이 채워짐
		
		int num=15;
		System.out.println(num<<2);
		}
		
		public static void method3() {
		// 3. >>>(right rotate)
		//'변수'의 값을 2^'숫자'만큼 오른쪽으로 이동
		// 부호비트도 같이 이동, 발생된 왼쪽 빈공간은 0이 채워짐
		
		int num2=-15;
		System.out.println(num2>>>2);
		System.out.println(num2>>>2);
		}
	

}
