package ddit.chap07.sec07;

public class UnitTest {

	public static void main(String[] args) {
		Unit u1=new Tank(100,100);
		u1.stop(100,100,"탱크");
		u1.move(200, 500);
		System.out.println("----------------------------------");
		
		Unit u2=new Marine(100,100);
		Marine m1=new Marine();
		u2.stop(100,600,"해병");
		m1.stimPack();
		u2.move(200, 300);
		System.out.println("----------------------------------");
		
		Unit u3=new DropShip(300,200);
		DropShip d1=new DropShip();
		u3.stop(100,600,"수송선");
		d1.load();
		u3.move(800, 300);
		d1.unload();
	}
}

//Unit class
//멤버 변수 : 정수형 좌표값(x,y), unit의 종류를 나타내는 변수
//멤버 메서드 : 이동(move) 메서드 => 각 unit을 이동시킬 좌표값을 매개변수로 전달해야함
//	      정지 stop(메서드) => 현재 좌표와 unit의 종류를 멤버 변수에 저장하고 그 내용을 출력
//
//Unit의 자식 class
//1. Tank
//  -고유메서드 : sizeMode()=>"공격모드로 변환"을 출력하는 메서드
//  -재정의메서드 : move(x,y) => 탱크의 위치가 (x,y) 위치로 이동" 출력
//
//2. Marine
//  -고유메서드: stimPack()=>"공격모드로 변환 : 스팀팩 장전"을 출력하는 메서드
//  -재정의 메서드 : move(x,y)=>"해병의 위치가 (x,y) 위치로 이동"출력
//
//3. DropShip
//  -고유메서드 : load()=>"탑승모드 : 유닛탑승"을 출력하는 메서드
//	       unload()=>"탑승모드: 유닛하강"을 출력하는 메서드
//  -재정의매서드 : move(x,y)=>"수송선 위치가 (x,y) 위치로 이동" 출력