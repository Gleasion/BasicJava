package ddit.chap08.sec05;

public class Kevin extends Human implements Programmer, Swimable {
	public Kevin() {}
	public Kevin(int x, int y, int age) {
		super(x,y,age);
	}
	
	@Override
	public void writeCode() {
		System.out.println("스킬은 자바 코딩입니다.");
	}

	@Override
	public void SwimDown(int yDistance) {
		if(yDistance>=50) {
			System.out.println("현재 수심 "+yDistance+"m 케빈은 죽었습니다.");
			System.out.println("캐릭터를 재 생성하세요.");
			System.exit(0);
		}else {
			System.out.println("현재 수심은 "+yDistance+"m 입니다.");
		}
	}
	
	@Override
	public void showInfo() {
		System.out.println("케빈("+getAge()+"세)의 현재 위치는 ("+getX()+","+getY()+")입니다.");
	}
		 
	
}
