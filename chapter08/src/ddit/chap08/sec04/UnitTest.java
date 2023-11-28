package ddit.chap08.sec04;

public class UnitTest {

	public static void main(String[] args) {
		Tank t=new Tank();
		DropShip d=new DropShip();
		Marine m=new Marine();
		SCV scv=new SCV();
		
		scv.repair(t);
		scv.repair(d);
		//scv.repair(m); //interface 구현X 오류
	}

}
