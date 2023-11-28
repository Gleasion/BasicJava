package ddit.chap06.sec04;

public class Product {
	private static int prodId; //static prodId를 업데이트 하기 위해 한번만 초기화
	private String prodName;
	private int price;
	
	public Product(){} // 쓰게 되면 this();
	
	public Product(String prodName, int price) {
		prodId++;//1씩 증가,,.,
		this.prodName=prodName;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "상품코드 : "+prodId+"\n상품명 : "+prodName+"\n판매가격 : "+price+
				"\n--------------------------------------";
	}
	
}
