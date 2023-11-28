package ddit.chap03.sec01;

import java.util.Scanner;

public class ArithmeticOperator {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		oddEven();
		leafYear(); //대소문자 구분 필수
	}
		
	public static void oddEven() { //메서드 밖에서 무언가를 부를 때는 시점을 같게 해주어야함
		// 산술연산자 : +,-,/,*,%
		// 1. 키보드로 임의의 숫자를 입력 받아 짝수인지 홀수인지를 판별하라.
		//oddEven();
		
		System.out.println("정수 입력 : ");
		int num=Integer.parseInt(sc.nextLine());
		if(num%2==0) {// year 나누기 2가 0인지??
			System.out.println(num+"은 짝수입니다");
		} else {
			System.out.println(num+"은 홀수입니다");
		}
	}

	public static void leafYear() {
		// 2. 임의의 년도를 입력 받아 해당 년도가 윤년인지 평년인지를 판별하시오.
		// 윤년 : 4의 배수이면서 100의 배수가 아니거나 또는 400의 배수가 되는 년도
		System.out.print("년도 입력 : ");
		int year=Integer.parseInt(sc.nextLine());
		
		if((year%4==0 && year%100 !=0) || (year%400==0)){ //&&는 AND
		System.out.println(year+"년은 윤년입니다");
		}else {
			System.out.println(year+"년은 평년입니다");
		}
	
	}
	
	
	
}
