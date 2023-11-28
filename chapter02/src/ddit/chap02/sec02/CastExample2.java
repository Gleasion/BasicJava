package ddit.chap02.sec02;

import java.util.Scanner; // java.until패키지의 Scanner class를 현재 프로그램에 포함

//★package(-한문장으로 끝) 다음에 import(-여러문장 가능) 가 와야함

public class CastExample2 {

	public static void main(String[] args) {		
	
		Scanner sc=new Scanner(System.in); // import 필요
		// 키보드로 자료 입력 : Scanner class(자바에서 제공되어지는 class)
		System.out.print("정수 입력 : ");
		int num=sc.nextInt();
		
		System.out.println(num);
		System.out.println((char)num); //강제 형변환 연산자 () 숫자를 문자로 출력
		
		
	}

}
