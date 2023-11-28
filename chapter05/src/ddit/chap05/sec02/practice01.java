package ddit.chap05.sec02;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		//method1();
		//method2();
		method3();
		//method4();
	}	
		public static void method1(){
		//문제 1. 금액(거스름돈)을 입력 받아 최소 갯수로 거스름돈을 주기 위한 맷수(갯수)를 구하시오. (1차원배열 사용)

			int[] monetaryunit={10000,5000,1000,500,100,50,10}; //화폐단위
		
			Scanner sc=new Scanner(System.in);
			System.out.print("거스름돈을 10원 단위로 입력 : ");
			int change=sc.nextInt(); //거스름돈
		
			for(int i=0; i<monetaryunit.length; i++) {
				System.out.println(monetaryunit[i]+"원\t"+change/monetaryunit[i]+"매(개)");
				change=change%monetaryunit[i];
			}
		}
		
		public static void method2(){
		//문제2. 주사위를 50번 던졌을때 나온 눈의 갯수로 다음과 같은 히스토그램을 구성하시오.
		
		//	1|********(8)
		//	2|*****(5)
		//	3|************(12)
		//	4|**********(10)
		//	5|*******(7)
		//	6|********(8)
		//	=> 출력형식만 참고하시오.
			
			int[] dice={1,2,3,4,5,6};
			
			int[] rnd=new int[50];
				for(int i=0; i<50; i++) {
				rnd[i]=(int)(Math.random()*dice.length);
			}
				
			int[] count=new int[6];{
				for(int i=0; i<rnd.length; i++) {
					count[rnd[i]]++;
				}
			
			System.out.print("1|");
				for(int i=0; i<count[0]; i++) {
					System.out.print("*");
				}
			System.out.println();
			
			System.out.print("2|");
				for(int i=0; i<count[1]; i++) {
					System.out.print("*");	
				}
			System.out.println();
			
			System.out.print("3|");
				for(int i=0; i<count[2]; i++) {
					System.out.print("*");	
				}
			System.out.println();
			
			System.out.print("4|");
				for(int i=0; i<count[3]; i++) {
					System.out.print("*");	
				}
			System.out.println();
			
			System.out.print("5|");
				for(int i=0; i<count[4]; i++) {
					System.out.print("*");	
				}
			System.out.println();
			
			System.out.print("6|");
				for(int i=0; i<count[5]; i++) {
				System.out.print("*");	
				}
			}
		}
		
		public static void method3(){
		
			int[] dice=new int[6];
		
			for(int i=0; i<50; i++) {
				int rnd=(int)(Math.random()*dice.length);
				dice[rnd]++;
			}
				
							
			for(int i=0; i<dice.length; i++) {
				System.out.print((i+1)+"|");
				for(int j=0; j<dice[i]; j++) {
					System.out.print("*");
				}
				System.out.println("("+dice[i]+")");
				}
			}
			
		public static void method4(){
			int[] count = new int[6];
			String[] str = new String[6];
			
			//i : 0 ~ 5 (ok)
			for(int i=0; i<str.length; i++) {
				str[i] = (char)i + 1 + "|";
				
//				System.out.println(str[i]);
			}
			
			int rnd = 0;
			
			//i : 0 ~ 49
			for(int i=0; i<50; i++) {
				rnd=(int)(Math.random()*6)+1;
				//ok
//				System.out.println("rnd : " + rnd);
				
				switch(rnd) {
					case 1:
						//str[0]에 *을 누적
						str[rnd-1]+="*";
						//count[0] = count[0] + 1(1증가)
						count[rnd-1]++;
						break;
					case 2:
						str[rnd-1]+="*";
						count[rnd-1]++;
						break;
					case 3:
						str[rnd-1]+="*";
						count[rnd-1]++;
						break;
					case 4:
						str[rnd-1]+="*";
						count[rnd-1]++;
						break;
					case 5:
						str[rnd-1]+="*";
						count[rnd-1]++;
						break;
					case 6:
						str[rnd-1]+="*";
						count[rnd-1]++;
						break;
				}//end switch
			
			}//end for

			for(int i=0;i<6;i++) {
				System.out.println(str[i]+"("+count[i]+")");	//6회 찍힘
			}
		}//end method4()
}
		

