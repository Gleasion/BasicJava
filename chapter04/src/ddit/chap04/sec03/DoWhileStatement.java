package ddit.chap04.sec03;

import java.util.Scanner;

public class DoWhileStatement {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		//String class는 별도의 저장공간을 마련하므로 많은 개체를 사용할 때 저장공간이 많아져서 비효율적
		//String buffer, String Builder: 저장했던 저장공간에 계속적으로 저장
		//import 사용 안해도 됨
		sb.append("*** 커피 메뉴 ***\n");
		sb.append("1. 아메리카노        2000원\n"); 
		sb.append("2. 카페라떼           3500원\n");
		sb.append("3. 카라멜마끼아또    5000원\n");
		sb.append("4. 자바칩 프라프치노 6500원\n");
		sb.append("5. 프로그램 종료\n");
		
		int sum=0;
		int exit=0;
		String bill="**영수증**\n";
		
		do {
			System.out.println(sb.toString());
			//toString() class는
			//object 모든 자바 클래스의 부모 클래스
			Scanner sc=new Scanner(System.in);
			
			System.out.println("커피를 선택하시오 : ");
			int choice=Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1:
				sum+=2000;
				bill+="아메리카노        2000원\n";
				break;
			case 2:
				sum+=3500;
				bill+="카페라떼           3500원\n";
				break;
			case 3:
				sum+=5000;
				bill+="카라멜마끼아또    5000원\n";
				break;
			case 4:
				sum+=6500;
				bill+="자바칩 프라프치노 6500원\n";
				break;
			case 5:
				exit=-1;
				break;
			default :
				System.out.println("작업번호 선택 오류!!");
			}
			
			if(exit==-1){
				System.out.println("프로그램 종료...");
				break; //while문을 벗어나게 해줌
			}
			
			}while(true);
			bill+="--------------------\n";
			bill+="총합계                "+sum+"원";
			System.out.println(bill);
			
		}
}