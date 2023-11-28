package ddit.chap08.sec05;

import java.util.Scanner;

public class CreatureExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Kevin k1 = new Kevin(12,11,12);
		k1.showInfo();
		k1.Talk();
		k1.attack();
		k1.writeCode();
		System.out.print("몇 m 잠수합시겠습니까? 입력: ");
		int ydk=Integer.parseInt(sc.next());
		k1.SwimDown(ydk);
		System.out.println("-----------------------------");
		
		Turtle t1=new Turtle(13,15,105);
		t1.showInfo();
		t1.attack();
		System.out.print("몇 m 잠수합시겠습니까? 입력: ");
		int ydt=Integer.parseInt(sc.next());
		t1.SwimDown(ydt);
		System.out.println("-----------------------------");
		
		Pigeon p1=new Pigeon(45,15,3);
		p1.showInfo();
		p1.attack();
		System.out.print("고도를 몇 m 날겠습니까? 입력: ");
		int ydp=Integer.parseInt(sc.next());
		p1.fly(ydp);
		System.out.print("몇 m 이동하겠습니까? 입력: ");
		int xydp=Integer.parseInt(sc.next());
		p1.flymove(xydp,ydp);
		
	}

}
