package ddit.chap06.sec04;

import java.util.Scanner;

public class ShapeExample {

	public static void main(String[] args) {
		// 도형의 객체(Shape)를 생성하시오.
		// 1. 멤버필드 : 도형종류(kind)
        //가로(wdith), 높이(height)
		//2. 메서드 : 생성자, 삼각형의 넓이를 구하는 메서드, 사각형의 넓이를 구하는 메서드
		//=> 도형의 종류를 판단하여 사각형과 삼각형 중 하나의 넓이를 구하는 메서드 를 호출하시오
		// 1/2 x 밑변 x 높이
		
		Shape sh1=new Shape();
		
		System.out.print("가로 입력 : ");
		Scanner sc1=new Scanner(System.in);
		int width=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int height=sc2.nextInt();
		
		Shape sh2=new Shape(width, height);
		
		System.out.print("삼각형이면 3, 사각형이면 4 입력 : ");
		Scanner sc3=new Scanner(System.in);
		int kind=sc3.nextInt();
		
		sh2.printArea();
		
		
	}

}
