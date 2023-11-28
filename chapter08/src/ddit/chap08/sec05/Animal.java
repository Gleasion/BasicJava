package ddit.chap08.sec05;

public abstract class Animal extends Creature {

	public Animal() {}
	public Animal(int x, int y, int age) {
		super(x,y,age);
	}
	
	@Override
	public void attack() {
		System.out.println("몸을 사용하여 공격하다.");
	}

}
