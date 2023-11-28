package ddit.chap06.sec01;

public class Product {
	int prdCode;
	String prdName;
	String manuComp;
	int prdPrice;
	
	public Product(int prdCode, String prdName, String manuComp, int prdPrice) {
		this.prdCode=prdCode;
		this.prdName=prdName;
		this.manuComp=manuComp;
		this.prdPrice=prdPrice;
	}
		
	public void proRegist(int code, String name, String comp, int price) {
		int prdCode=code;
		String prdName=name;
		String manuComp=comp;
		int prdPrice=price;
		
	}
	
	public void proModifi(String newName) {
		prdName=newName;
	}
	
	public void proInfo() {
		System.out.print("상품코드 : ");
		System.out.println(prdCode);
		System.out.print("상품명 : ");
		System.out.println(prdName);
		System.out.print("제조회사 : ");
		System.out.println(manuComp);
		System.out.print("가격 : ");
		System.out.println(prdPrice);
	}
	
}
