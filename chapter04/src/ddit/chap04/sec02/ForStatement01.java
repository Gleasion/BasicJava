package ddit.chap04.sec02;
import java.util.Scanner;
public class ForStatement01 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		//forExample01();
		//forExample02();
		//forExample03();
		forExample04();

	}
	
	public static void forExample01() {
		//1부터 100까지의 합을 구하시오.
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			//int sum=0; //필수로 초기화 해야함 초기화를 하지 않으면 오류,,
			//int sum; //sum에 무슨 값이 들어갔는지 모르기 때문에 오류
			sum=sum+i;
			//System.out.println("합="+sum);-> 안에서 출력하면 1부터 100까지 더한 값을 전부 출력
		}
		System.out.println("합="+sum); //출력을 하려면 for문 밖에서 선언해야함
	}
	
	public static void forExample02() {
		//1부터 100까지 수엥서 홀수의 합과 짝수의 합을 구하시오.
		
		int odd=0; //홀수의 합
		int even=0; //짝수의 합
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				even+=i; //even=even+i 변수가 결과가 기억될 장소, 오른쪽변수도 반드시 사용 되어야함
			}else {
				odd=odd+i;
			}
		}
		System.out.printf("짝수의 합=%5d\n",even);
		System.out.printf("홀수의 합=%5d",odd);
	}
	
	public static void forExample03() {
		//알파벳 'A'에서 'Z'까지 붙여서 출력하시오.
		
		System.out.print("A부터 Z까지 출력= ");
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			System.out.printf("%s",ch); //자리수를 자동적으로 효율 있게 설정해줌
			System.out.printf("%2s",ch); //자리수를 바꾸어 공백도 할 수 있음
		}
		
	}
	
	public static void forExample04() {
		//키보드로 2-9사이의 정수를 입력 받아 해당수의 구구단을 출력하시오.
		
		System.out.print("2부터 9까지의 정수를 입력하시오: ");
		int dan=Integer.parseInt(sc.nextLine());
		
		for(int i=2; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			
		}	
	}
	
}
