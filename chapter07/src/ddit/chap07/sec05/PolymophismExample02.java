package ddit.chap07.sec05;

public class PolymophismExample02 {
	public static void main(String[] args) {
	
		Customer c1=new Customer(1011,"홍길동");
	
		System.out.println("구입가격 : "+c1.calcPrice(1000));
		System.out.println(c1);
		System.out.println("--------------------------");
		
		Customer c2=new GoldCustomer(1201,"이순신");
		System.out.println("구입가격 : "+c2.calcPrice(1000));
		System.out.println(c2);
		System.out.println("--------------------------");
	
		Customer c3=new VIPCustomer(2011,"정몽주",999);
		System.out.println("구입가격 : "+c3.calcPrice(1000));
		System.out.println(c3);
	
	}
}
