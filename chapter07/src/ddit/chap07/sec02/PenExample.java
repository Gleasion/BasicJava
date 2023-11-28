package ddit.chap07.sec02;

public class PenExample {
	//다음은 필기구의 속성과 기능을 설명한 것이다. 상속을 이용하여 클래스들을 설계하시오.
	//1)샤프펜슬
	//속성: 굵기, 남은양
	//기능: 남은양 설정과 남은양 반환
	//		굵기 설정과 굵기 반환
	//2)볼펜
	//속성: 볼펜의 잉크색, 남은양
	//기능: 남은양 설정과 남은양 반환
	//		볼펜의 잉크색 설정과 볼펜의 색 반환
	//3)만년필
	//속성: 잉크색상, 남은 양
	//기능: 남은양 설정과 남은양 반환
	//		잉크색상 설정과 잉크 색상 반환
	//		잉크리필

	public static void main(String[] args) {
		SharpPen p1=new SharpPen(15,0.5);
		System.out.println("남은 심의 갯수 : "+p1.getAmount());
		System.out.println("심의 굵기 : "+p1.getWidth());
		
		p1.setAmount(20);
		System.out.println("남은 심의 갯수 : "+p1.getAmount());
		System.out.println("심의 굵기 : "+p1.getWidth());
		
		FountainPen p2=new FountainPen(30,"파란색");
		p2.setColor("빨강색");
		System.out.println("볼펜의 잉크 색상 : "+p2.parentColor());
		System.out.println("만년필의 잉크색상 : "+p2.getColor());
		
		//FountainPen p3=new FountainPen("빨강색");
		//System.out.println("만년필의 잉크색상 : "+p3.getColor());
		
		System.out.println("리필 전 만년필에 남은 잉크량 : "+p2.getAmount()); // 위에서 30세팅
		p2.refill(10); //리필 채워줌
		System.out.println("리필 후 만년필에 남은 잉크량 : "+p2.getAmount());
		//System.out.println("리필 전 만년필에 남은 잉크량 : "+p2.getAmount()+"\t리필 후 만년필에 남은 잉크량 : "+p2.refill(10));
		
		
		
		
	}

}
