package ddit.chap07.sec07;

public class Marine extends Unit{
	
	Marine(){}
	Marine(int x, int y){
		super(x,y,"해병");
	}
	
	public void stimPack() {
		System.out.println("공격모드로 변환 : 스팀팩 장전");
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println(getkind()+"의 위치가 ("+x+","+y+") 위치로 이동했습니다.");
	}
	
}
