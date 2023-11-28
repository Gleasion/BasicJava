package ddit.chap07.point.view;

import java.util.Scanner;
import ddit.chap07.point.controller.CircleController;
import ddit.chap07.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc=new Scanner(System.in);
	private CircleController circleController=new CircleController();
	private RectangleController rectangleController=new RectangleController();
	
	public void mainMenu(){
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("----------------");
		System.out.print("메뉴선택 : ");
		int menu=sc.nextInt();
	
		while(true) {
			switch(menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;	
			case 9:
				System.out.println("작업을 종료합니다.");
				System.exit(0);
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("====원 메뉴====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로 복귀");
			System.out.print("메뉴 선택 : ");
			int menu=sc.nextInt();
			
			if(menu==1) {
				System.out.println(circleController.getCircum(100, 200, 50));
			}else if(menu==2) {
				System.out.println(circleController.getArea(100, 200, 50));
			}else if(menu==9) {
				mainMenu();
			}
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.println("====사각형 메뉴====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로 복귀");
			System.out.print("메뉴 선택 : ");
			int menu=sc.nextInt();
			if(menu==1) {
				System.out.println(rectangleController.getPerimeter());
			}else if(menu==2) {
				System.out.println(rectangleController.getArea());
			}else if(menu==9) {
				mainMenu();
			}
		}
	}
	
}
