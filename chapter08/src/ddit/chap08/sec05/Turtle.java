package ddit.chap08.sec05;

public class Turtle extends Animal implements Swimable {
	public Turtle() {}
	public Turtle(int x, int y, int age) {
		super(x,y,age);
	}
	
	@Override
	public void attack() {
		System.out.println("등껍질을 이용하여 공격할 수 있습니다!!");
	}
	
	@Override
	public void SwimDown(int yDistance) {
		if(yDistance>=100) {
			System.out.println("수심 "+yDistance+"m 거북이는 죽었습니다.");
			System.out.println("캐릭터를 재 생성하세요.");
			System.exit(0);
		}else {
			System.out.println("수심은 "+yDistance+"입니다.");
		}
	}
	
	@Override
	public void showInfo() {
		System.out.println("거북이("+getAge()+"세)의 현재 위치는 ("+getX()+","+getY()+")입니다.");
	}
	
	
	
	
	
	
}
