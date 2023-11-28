package ddit.chap08.sec05;

public abstract class Human extends Creature implements Talkable {

	public Human() {}
	public Human(int x, int y, int age) {
		super(x,y,age);
	}
	
	@Override
	public void attack() {
		System.out.println("도구로 공격할 수 있습니다!!");
	}

	@Override
	public void Talk()  {
		System.out.println("말을 사용하여 의사소통할 수 있습니다.");
	}
		
	
	
}
