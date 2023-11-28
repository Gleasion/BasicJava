package ddit.chap03.sec01;

public class BitwiseOperator {

	public static void main(String[] args) {
		// bit 별 연산자 : &(비트별 AND 곱셈), |(비트별 OR 덧셈), ^((비트별 EX-OR 논리)
		// 결과가 숫자

		int num1=27; //2진수 00011011
		int num2=32; //2진수 00100000
		
		int res=num1&num2; //곱셈
		System.out.println(res);
		System.out.println(num1|num2); //덧셈
		System.out.println(num1^num2); //논리연산자
		
		
	}

}
