package ddit.chap03.sec01;

import java.util.Scanner;

public class ConditionOperator {

	static Scanner sc=new Scanner(System.in);
		
	public static void main(String[] args) {
		// 조건연산자(삼항연산자)
		// (조건)? 값1 : 값2 -> '조건'이 참이면 '값1'을 반환하고 거짓이면 '값2'를 반환함
		// if 함수랑 비슷하다고 생각하면 쉬움
		
		//method1();
		method2();
	}

	
	public static void method1() {
		// 1. 키보드로 정수를 입력받아 그 값이 60점 이상이면 "합격", 그 이하면 "과락"을 출력
	System.out.println("점수 입력 : ");
	int score=sc.nextInt();
	
	String str=(score>=60)? "합격" : "과락";
	System.out.println(score+" => "+str);
	}
	
	public static void method2() {
		// 1. 키보드로 정수를 입력받아 그 값이
		// 100~90 : "A"
		// 89~80 : "B"
		// 79~70 : "C"
		// 69~60 : "D"
		// 그 이하 : "F"를 작성(삼항연산자 사용)
		
	System.out.println("점수 입력 : ");
	int score=sc.nextInt();
	
	char grade=(score>=90)? 'A':((score>=80)? 'B':((score>=70)? 'C' :((score>=60)? 'D' : 'F')));
	System.out.println(score+" => " +grade);
	// 90점을 걸러서 80으로 가기 때문에 굳이 범위 설정 할 필요 없음
	}
	
}
