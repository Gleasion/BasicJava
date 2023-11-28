package ddit.chap06.sec04;

import java.util.Scanner;

public class ShapeExample01 {

	public static void main(String[] args) {
		// // 도형의 객체(Shape)를 생성하시오.
		// 1. 멤버필드 : 도형종류(kind)
        //가로(width), 높이(height)
		//2. 메서드 : 생성자, 삼각형의 넓이를 구하는 메서드, 사각형의 넓이를 구하는 메서드
		//=> 도형의 종류를 판단하여 사각형과 삼각형 중 하나의 넓이를 구하는 메서드 를 호출하시오
		// 1/2 x 밑변 x 높이
		//수행순서
		// 1) 도형객체 생성 후 도형의 종류를 반환받아 
		//2) 삼각형과 사각형을 판단한 후
		//       삼각형이명 삼각형 면적구하는메서드 호출
		//       사각형이면 사각형 면적 구하는 메서드 호출
		
		System.out.print("도형 입력: ");
		Scanner sc=new Scanner(System.in);
		String kind=sc.next();
		
		System.out.print("가로 입력: ");
		int width=Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 입력: ");
		int height=Integer.parseInt(sc.nextLine());
		
		Shape01 sh1=new Shape01(kind,width,height);
		
		sh1.printArea();
		
	}

}
