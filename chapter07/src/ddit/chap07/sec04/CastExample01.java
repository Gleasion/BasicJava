package ddit.chap07.sec04;

public class CastExample01 {

	public static void main(String[] args) {
		Customers c1=new Customers();
		
		c1.buy(new Computer(350,2));
		c1.buy(new Tv(400,3));
		
		
		c1.sumary();
		
	}

}
