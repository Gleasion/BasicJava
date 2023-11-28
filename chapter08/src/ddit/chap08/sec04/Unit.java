package ddit.chap08.sec04;

interface Repairable{} //보통의 interface의 이름은 able으로 끝남

public class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP=hp; //한번 초기화되면 더이상 초기화 하거나 값을 변경할 수 없고, 변수를 박탈당함 
	}
}

class GroundUnit extends Unit{
	public GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	public AirUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() {
		return "탱크";
	}

}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(120);
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() {
		return "수송선";
	}
}

class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() {
		return "해병";
	}

}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint=MAX_HP;
	}
	
	@Override
	public String toString() {
		return "수리공장";
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) { // Marine을 빼고 ,,
			Unit u=(Unit)r;
			while(u.hitPoint != MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u+"의 수리가 끝났습니다.");
		}
		
	}
}