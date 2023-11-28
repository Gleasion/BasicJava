package ddit.chap03.sec01;

import java.util.Scanner;

public class LogicalOperator { //class가 만들어줌

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		method1();
		getGender();
		method2();
		
		//Scanner sc=new Scanner(System.in); //main method안에 있어서 static 필요x
		
		// 논리연산자  : !(not), &&(and), ||(or)
		/*
		 --------------------------------------------
		 	입력			AND		OR	 EX-OR
		 A		B
		 0		0		0		0		0
		 0		1		0		1		1
		 1		0		0		1		1
		 1		1		1		1		0
		 */
	}
		
		
		public static void method1() {
		/* 1. 회원의 이름과 마일리지를 입력받아 마일리지가
			0-1000 : 새싹회원
		 	1001-3000 : 일반회원
		 	그 이상 : VIP 회원을 출력하시오.
		 //구간을 정하는 연산자 : AND	*/
		 	System.out.println("회원명 : ");
		 	String memName=sc.nextLine();
		 	
		 	System.out.print("마일리지 : ");
		 	int mileage=Integer.parseInt(sc.nextLine());
		 	
		 	String rankName = ""; // Null 값 부여
		 	if(mileage>=0 && mileage<=1000) {
		 		//rankName cannot be resolved to a variable 변수로 선언되지 않음
		 		rankName="새싹회원";
		 	}else if(mileage>1000 && mileage<=3000) {
		 		rankName="일반회원";
			}else {
				rankName="VIP회원";
			}
			System.out.println(memName+"회원의 마일리지는 "+mileage+"이고 "+"회원등급은"+rankName+"입니다.");
		}
	  
		
	public static void getGender() {
		/* 2. 회원의 주민등록번호를 xxxxxx-xxxxxxx형식으로 입력받아 성별을 구하세요.
		 // oracle : 1번부터 counting
		 // java : 0번부터 counting
		 // 1 이거나 3, 2 이거나 4 : 여성
		 // class는 method가 지원됨
		 // charater.at : 특정 위치에 있는 값을 불러옴
		 */
	System.out.print("주민번호(123456-1234567) : ");
	String registerNum=sc.nextLine(); 
	
	char gender=registerNum.charAt(7); //결과값은 문자 : registerNum 문자 갯수를 반환
	String genName="";
	
	if(gender=='1'||gender=='3') {
		genName="남성회원";
	}else if(gender=='2'||gender=='4'){ //나머지값이 전부라면 if를 붙일 필요 없음
		genName="여성회원"; 
	}else {
		genName="주민번호 잘못입력"; 
	}
	
	System.out.println("주민번호 "+registerNum+"은 "+genName+"입니다.");
	
	}

	public static void method2() {
		System.out.println("회원명 : ");
		String memName=sc.nextLine();
	
		System.out.print("마일리지 : ");
		int mileage=Integer.parseInt(sc.nextLine());
	
		String rankName=""; // Null 값 부여
		if(mileage>=0 && mileage<=1000) {
			rankName="새싹회원";
		}else if(mileage>1000 && mileage<=3000) {
		rankName="일반회원";
		}else {
			rankName="VIP회원";
		}
	}
}