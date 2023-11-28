package ddit.chap08.sec05;

public class Pigeon extends Animal implements Flyable{
	
	public Pigeon() {}
	public Pigeon(int x, int y, int age) {
		super(x,y,age);
	}
	
	@Override
	public void attack() {
		System.out.println("부리를 이용하여 공격할 수 있습니다!!");
	}
	
	@Override
	public void fly(int yDistance) {
		if(yDistance>10000) {
			System.out.println("고도 "+yDistance+"m 비둘기는 죽었습니다.");
			System.out.println("캐릭터를 재 생성하세요.");
			System.exit(0);
		}else {
			System.out.println("현재 고도는 "+yDistance+"m 입니다.");
		}
	}

	@Override
	public void flymove(int xDistance, int yDistance) {
		System.out.println("현재 ("+xDistance+","+yDistance+")로 이동하였습니다.");
	}
	
	@Override
	public void showInfo() {
		System.out.println("비둘기("+getAge()+"세)의 현재 위치는 ("+getX()+","+getY()+")입니다.");
	}

}
