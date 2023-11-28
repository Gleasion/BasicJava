package ddit.chap02.sec02;

import java.util.Scanner;

public class CastExample4 {

	public static void main(String[] args) {
		// Scanner class
		// nextLine() : enter키 구별, 엔터키 전까지 입력할 때 까지의 모든 자료
		// next() : 입력 자료 중 공백으로 전까지의 자료
		// nextLine()를 주로 사용 : return type이 String
		// Wrapper class 사용
		// (8가지) Boxing: 일반데이터(8가지) type을 rap을 씌우거나 박스에 넣으면 객체타입이 됨
		// unboxing, autoboxing
		
/*		        wrapper class
 		byte    Byte          래퍼클래스명.parseByte
		short   Short
		int     Integer       래퍼클래스명.parseInt();
		long    Long
		char    Character
		float   Float
		double  Double
		boolean Boolean

								래퍼클래스명.parse일반데이터타입명(문자열)

		*/
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번쩨 정수 입력 : ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println(num1);
		
		System.out.print("첫 번째 문자열 입력 : ");
		String str1=sc.nextLine();
		System.out.println(str1);
		
		System.out.print("두 번째 문자열 입력 : ");	
		int num2= sc.nextInt();
		System.out.println(num2);
		
		System.out.print("두 번째 정수 입력 : ");
		String str2=sc.next();
		System.out.println(str2);

		//enter값이 넘어감
		
		int num=Integer.parseInt(sc.nextLine());
		
		String name=sc.nextLine();
		
		double num0=Double.parseDouble(sc.nextLine());
		
		
	}

}
