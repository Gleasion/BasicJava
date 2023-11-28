package ddit.chap04.sec02;

import java.util.Scanner;

public class ForStatement02 {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// 2-9단까지 구구단을 출력하시오.
	
		//forExample01();
		//forExample02();
		//forExample03();
		//forExample04();
		//forExample05();
		forExample06();
		
	}
		
		public static void forExample01() {
			
		for(int i=2; i<10; i++) { //출력되어지는 줄 수
			System.out.println("["+i+"단"+"]");
			
			for(int j=1; j<10; j++) { //한줄에 출력되어지는 문자의 개수
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		}
		
		public static void forExample02() {
			// 아래를 출력하라.
			// *
			// **
			// ***
			// ****
			// *****
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
			}
		}

		
		public static void forExample03() {
			// 아래를 출력하라.
			// *****
			//  ****
			//   ***
			//    **
			//     *
		
			for(int i=0; i<5; i++) {
				for(int j=0; j<i; j++) { //공백 인쇄
					System.out.print(" ");
				}
				for(int k=0; k<5-i; k++) {
					System.out.print("*");
			}
			System.out.println();
			}
		
		}
		
		public static void forExample04() {
			// 아래를 출력하라.
			// *****
			// ****
			// ***
			// **
			// *
			
			for(int i=0; i<5; i++) {
				for(int j=0; j<5-i; j++) { //공백 인쇄
					System.out.print("*");
				}
				System.out.println();
			}
			
			}
		
		public static void forExample05() {
			// 아래를 출력하라.
			//     *
			//    ***
			//   *****
			//  *******
			// *********
			
			for(int i=0; i<5; i++) {
				for(int k=0; k<4-i; k++) {
					System.out.print(" ");
				}
				for(int j=0; j<(2*i)+1; j++) { //공백 인쇄
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public static void forExample06() {
			// 아래를 출력하라.
			// ********* 9 
			//  ******* 7 
			//   ***** 5
			//    *** 3
			//     * 1
			
			for(int i=0; i<5; i++) {
				for(int k=0; k<i; k++) { //공백 인쇄
					System.out.print(" ");
				}
				for(int k=0; k<(5-i)*2-1; k++) {
						System.out.print("*");
				}
				System.out.println();
			}		
		
		}
			
}
		
