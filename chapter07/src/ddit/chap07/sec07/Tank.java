package ddit.chap07.sec07;

public class Tank extends Unit {
	
	Tank(){}
	Tank(int x, int y){
		super(x,y,"탱크");
	}
	
	public void sizeMode() {
		System.out.println("공격모드로 변환");
	}

	@Override
	public void move(int x, int y) {
		System.out.println(getkind()+"의 위치가 ("+x+","+y+") 위치로 이동했습니다.");
	}

}
