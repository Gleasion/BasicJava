package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatement {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//season();
		//getNationName();
		getGrade();
	}

	public static void season() {
		//1-12월 중 어느 하나의 월을 입력 받아 봄/여름/가을/겨울을 판단하시오.
		// 12-2월 :겨울
		// 3-5월 : 봄
		// 6-8월 :여름
		// 9-11월 :가을
	
		System.out.print("월 입력 : ");
		int month=Integer.parseInt(sc.nextLine());
		
		String sea="";
		
		switch (month) { // :는 or 이라고 생각하면 됨
		case 12: case 1: case 2: sea="입력하신 월의 계절은 겨울입니다.";
			break;
		case 3: case 4: case 5: sea="입력하신 월의 계절은 봄입니다.";
			break;
		case 6: case 7: case 8: sea="입력하신 월의 계절은 여름입니다.";
			break;
		case 9: case 10: case11: sea="입력하신 월의 계절은 가을입니다.";
			break;
		default : System.out.println("월이 잘못 입력됐습니다.");
			sea="";
			}
			System.out.println(sea);
		}
	
	public static void getNationName() {
		System.out.print("국가명을 입력 하세요 : ");
		String str=sc.nextLine();
		
		switch (str){ //1.8부터 int 아닌 문자도 가능,,,
		case "korea": case "corea": case "kor":
			System.out.println("대한민국");
			break;
		case "japan": case "nippon":
			System.out.println("일본");
			break;
		case "china":
			System.out.println("중국");
			break;
		default:
			System.out.println("잘못된 국가명입니다.");	
		}
	
	}
		
	public static void getGrade() {
		String grade=null;
		
		System.out.print("80-100사이의 점수 입력 : ");
		int score=Integer.parseInt(sc.nextLine());
		
		switch(score/10) { //나누고 소수점을 날려서 나이를 구하는 것과 비슷 10~19살 => 10대
		case 10:
			grade="A+";
			break;
		case 9:
			grade="A";
			switch(score%10) {
			case 0: case 1: case 2:
				grade+="0";
				break;
			case 3: case 4: case 5: case 6:
					grade+="0";
					break;
			case 7: case 8: case 9:
				grade+="+";
			}
			break;
		case 8:
			grade="B";
			switch(score%10) {
			case 0: case 1: case 2:
				grade+="-";
				break;
			case 3: case 4: case 5: case 6:
					grade+="0";
					break;
			case 7: case 8: case 9:
				grade+="+";
			}
			break;
		}
		System.out.println(score+" => "+grade);
		}
		
}
	

