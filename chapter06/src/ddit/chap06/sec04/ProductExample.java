package ddit.chap06.sec04;

public class ProductExample {

	public static void main(String[] args) {
		//3개의 (제품번호 (int prodID)와 제품명(String proName), 판매가격(int price))
		//멤버변수를 가진 상품클래스를 생성하시오.
		//생성자와 상품클래스 정보를 반환하는 메서드도 작성하며
		//제품번호는 제품의 객체가 생성될 때마다 1씩 증가하는 값을 갖도록 설계하시오.
			
		Product p1=new Product("연필",1000);
		System.out.println(p1);
		//System.out.println(p2.toString());
		
		Product p2=new Product("지우개",1000);
		System.out.println(p2);
	}

}
