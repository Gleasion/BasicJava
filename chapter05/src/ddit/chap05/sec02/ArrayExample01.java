package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrEample01();
		arrEample02();
	}

	public static void arrEample01() {
		//정수 5개를 저장하는 배열을 생성하고 10,20,30,40,50,을 저장하시오.
		//1)선언,생성,초기화
		int[] num; //선언
		num=new int[5]; //생성
		//int[] num1=new int[5]; //선언과 생성을 한번에 작성하는 방법
		num[0]=10; //초기값이 불규칙적인 경우 사용
		num[1]=20; 
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		for(int i=0; i<num.length; i++) { //초기값이 규칙적일 때 사용
			num[i]=(i+1)*10;
		}
		
		int[] num2= new int[] {10,20,30,40,50}; //선언 및 생성,초기화를 동시에 진행
		int[] num3= {10,20,30,40,50};
		//일정기간동안 데이터가 저장되어질 수 있음		
	}
	
	public static void arrEample02() {
		//다음 점수자료를 배열에 저장하고 총점과 평균을 구하시오.
		//[자료] 65,70,95,60,70,85
		int sum=0;//총점
		int[] score=new int[] {65,70,95,60,70,85};// []안에 갯수XX
			
		//1)일반 for 명령 사용
		System.out.print("[");
		for(int i=0; i<score.length; i++) {
			sum=sum+score[i];
			System.out.printf("%3d",score[i]); //3칸으로 만들어준 이유는 빈칸 한칸 띄우기 위해
		}
		System.out.println(" ]");
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
			
		//2)enhanced for명령 사용
		System.out.print("[");
		for(int s : score) {
			sum=sum+s;
			System.out.printf("%3d",s);
		}
		System.out.println(" ]");
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
		
		//3)Arrays클래스의 toString()명령 사용
		for(int s : score) {
			sum=sum+s;	
		}
		System.out.println(Arrays.toString(score)); // 한칸씩 띄워서 배열 출력
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(double)sum/score.length);
	}	
	
}
