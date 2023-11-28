package ddit.chap08.sec05;

public abstract class Creature {
	private int x;
	private int y;
	private int age;
	
	public Creature(){}
	
	public Creature(int x, int y, int age) {
		this.x=x;
		this.y=y;
		this.age=age;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void attack(); //public abstract void 필수
	
	public abstract void showInfo();
	
	@Override
	public String toString() {
		return "현재 좌표는 ("+x+","+"y"+")\n나이 : "+age;
	}
	
	
}
