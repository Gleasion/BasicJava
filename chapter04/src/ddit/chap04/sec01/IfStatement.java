package ddit.chap04.sec01;
import java.util.Random;
import java.util.Scanner;
public class IfStatement {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//return 되돌림
		//void 절대 되돌리지 않음
		//method1(); //반환값이 있는 경우 변수=method();
		//method2();
		//method3();
		//method31();
		//method4();
		//method41();
		method5();
	}

	public static void method1() {
		//키보드로 점수하나를 입력 받아 60점 이상이면 "합격"
		//60점 미만이면 "불합격" 출력하시오.
				
		System.out.println("점수 입력 : ");
		int score=Integer.parseInt(sc.nextLine());
		
		if(score>=60) {
			System.out.println(score+" => 합격");
		}else { 
				System.out.println(score+" => 불합격");
		}
		
	}
	
	public static void method2() {
		//키보드로 점수하나를 입력 받아 그 값이
		//100~80: 우수
		//79~60: 보통
		//그 이하: 미흡을 출력하시오.
		
		System.out.print("점수 입력 : ");
		int score=Integer.parseInt(sc.nextLine());
		
		if(score<=100 && score>=80) {
			System.out.println("우수");
		}else if(score>=60 && score<=79) {
			System.out.println("보통");
		}else {
			System.out.println("미흡");
		}
	}
		
	
	public static void method3() {
		//1-12월 중 어느 하나의 월을 입력 받아 봄/여름/가을/겨울을 판단하시오.
		// 12-2월 :겨울
		// 3-5월 : 봄
		// 6-8월 :여름
		// 9-11월 :가을
		
		System.out.print("월 입력(1~12) : ");
		int month=Integer.parseInt(sc.nextLine());
		
		if(month==12||(month>=1 && month<=2)) {
			System.out.println("겨울");
		}else if(month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
				System.out.println("가을");
		}else {
			System.out.println("1부터 12의 값으로 다시 입력하시오.");
		}
	}	
	
	public static void method31() {
		String season="";
		System.out.print("월 입력(1~12): ");
		int month=sc.nextInt();
	
	}
	
	public static void method4() {
		//본인의 신장과 몸무게를 입력받아 BMI(Boday Mass Index)지수에 따른
		//결과를 정상, 과체중, 비만, 고도비만 등으로 판별하라.
		//BMI 지수=몸무게(Kg)/키(m)의 제곱
		// 1 ~ 18.4 : 저체중
		//18.5 ~ 22.9 : 정상
		//23.0 ~ 24.9 : 비만
		//30.0이상 : 고도비만
	
		System.out.print("신장(cm)을 입력하시오: ");
		double height=Double.parseDouble(sc.nextLine());
		height/=100;
		
		System.out.print("체중(kg)을 입력하시오: ");
		double weight=Double.parseDouble(sc.nextLine());
		
		double BMI=weight/(height*height);		
		
		if(BMI<=18.4 && BMI>=1) {
			System.out.println("저체중");
		}else if(BMI<=22.9 && BMI>=18.5) {
			System.out.println("정상");
		}else if(BMI<=24.9 && BMI>=23.0) {
			System.out.println("비만");
		}else if(BMI>=30) {
			System.out.println("고도비만");
		}else {
			System.out.println("올바른 값으로 입력하세요.");
		}
		
		System.out.println(BMI);
	}
	
	public static void method41() {
		//본인의 신장과 몸무게를 입력받아 BMI(Boday Mass Index)지수에 따른
		//결과를 정상, 과체중, 비만, 고도비만 등으로 판별하라.
		//BMI 지수=몸무게(Kg)/키(m)의 제곱
		// 1 ~ 18.4 : 저체중
		//18.5 ~ 22.9 : 정상
		//23.0 ~ 24.9 : 비만
		//30.0이상 : 고도비만
	
		System.out.print("신장(cm)을 입력하시오: ");
		double height=Double.parseDouble(sc.nextLine());
		height/=100;
		
		System.out.print("체중(kg)을 입력하시오: ");
		double weight=Double.parseDouble(sc.nextLine());
		
		double BMI=weight/(height*height);	
	
		String verdict="";
		if(BMI<18.5){
			verdict="저체중";
		}else if(BMI<23){
			verdict="정상";
		}else if(BMI<25){		
			verdict="과체중";
		}else if(BMI<30){
			verdict="비만";
		}else{
			verdict="고도비만";
		}
		System.out.println("입력한 자료는 "+verdict+"입니다");
	}
	
	public static void method5() {
		//컴퓨터와 가위 바위 보 게임
		Random ran=new Random();
		ran.setSeed(System.currentTimeMillis());
		
		int comNum=ran.nextInt(3)+1;
		
		System.out.println("가위:1, 바위:2, 보:3 입력 : => ");
		int myNum=sc.nextInt();
		
		int playNum=myNum-comNum;
		
		if (playNum==-1||playNum==2) {
			System.out.println("computer 승");
		}else if(playNum==-2||playNum==1) {
			System.out.println("user 승");
		}else {
			System.out.println("비김");
		}
		
	}
	
	
}
