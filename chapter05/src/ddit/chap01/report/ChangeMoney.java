package ddit.chap01.report;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] coin= {10000,5000,1000,500,100,50,10};
		
		System.out.print("거스름돈을 입력 : ");
		int money=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<coin.length; i++) {
			//System.out.println(coin[i]+"원 : "+(money/coin[i])+"매(개)"); // 나눈 몫을 출력하면 매수, 나머지는 다음에 나누어 반복
			System.out.printf("%6d : %2d매(개)\n",coin[i], money/coin[i]);
			money=money%coin[i];
		}	

	}

}
