package ddit.chap05.sec03;

import java.util.Arrays;

public class ArrayExample02 {

	public static void main(String[] args)  {
		//5명의 3과목 점수와 이름을 배열에 저장
		//배열명: 점수=>score, 이름=>stuName
		
		String[] stuName= {"강감찬","이순신","정몽주","박지원","홍길동"};
				
		int[][] score= {{60,70,80,0,0,1},{70,60,90,0,0,1},
				{90,80,80,0,0,1},{80,90,80,0,0,1},{70,60,70,0,0,1}};
		//{국어,영어,수학,총점,평균,등수} 초기값으로 setting
		//int[][] score1= new int[][] {{60,70,80},{70,60,90},
		// {90,80,80},{80,90,80},{70,60,70}};
		
		setGrade(score);
		setRank(score);
		bubbleRank(score, stuName);
		printReport(stuName, score);
	}
	
	public static void setGrade(int[][] score) {
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3]=score[i][3]+score[i][j];
			}
			score[i][4]=score[i][3]/3;
		}
	}
	
	public static void setRank(int[][] score) {
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
		}
	}
	
	public static void bubbleRank(int[][] score, String[] stuName){
		for(int i=0; i<score.length-1; i++) {
			for(int j=0; j<score.length-i-1; j++) {
				if(score[j][5]>score[j+1][5]) {
					int[] temp1=score[j]; //int 배열 임시저장
					score[j]=score[j+1];
					score[j+1]=temp1;
						
					String temp2=stuName[j]; //String 배열 임시저장
					stuName[j]=stuName[j+1];
					stuName[j+1]=temp2;	
					}
				}
			}
		}
	
	public static void printReport(String[] stuName, int[][] score) {
		
	System.out.println("             *********성     적     표**********          ");
	System.out.println("-----------------------------------------------------");
	System.out.println(" 이름\t국어\t영어\t수학\t총점\t평균\t등수");
	System.out.println("-----------------------------------------------------");
	
		for(int i=0; i<score.length; i++) {
			System.out.print(stuName[i]+"\t");
			
			for(int j=0; j<score[i].length; j++) {
				System.out.print(" "+score[i][j]+"\t");
				}
			System.out.println();
			}
	}
}

	//등수대로 출력하세요.
		