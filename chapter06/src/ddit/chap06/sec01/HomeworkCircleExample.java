package ddit.chap06.sec01;

import java.util.Scanner;

public class HomeworkCircleExample {

	public static void main(String[] args) {
		//문제1-정수형 반지름 값을 속성으로 가진 Circle 클래스를 작성하시오.
	    //넓이(Area)를 구하는 메서드와 둘래(Length)를 구하는 메서드를 작성

		HomeworkCircle cr1=new HomeworkCircle();

		System.out.print("반지름을 정수를 입력 : ");
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		
		cr1.Area(radius);
		cr1.Length(radius);
		
		
		
	}

}
