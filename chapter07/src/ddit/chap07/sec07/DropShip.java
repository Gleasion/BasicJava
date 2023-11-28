package ddit.chap07.sec07;

public class DropShip extends Unit{

	DropShip(){}
	DropShip(int x, int y){
		super(x,y,"수송선");
	}
	
	public void load() {
		System.out.println("탑승모드 : 유닛탑승");
	}	
		
	public void unload() {
		System.out.println("탑승모드: 유닛하강");
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println(getkind()+"의 위치가 ("+x+","+y+") 위치로 이동했습니다.");
	}
	
}
