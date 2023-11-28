package ddit.chap06.sec01;

public class ProductExample {

	public static void main(String[] args) {
		//문제 2. 제품코드, 제조회사, 크기, 가격  정보를 보류한 상품클래스를 작성
	    //필드 : 제품코드(int prdCode), 제품명(String prdName),
		//제조회사(String manuComp), 가격(int prdPrice)
	    //메서드 : 등록(proRegist), 수정(proModifi), 조회(proInfo) 메서드
		
		Product prd=new Product(230415001,"블랙가죽자켓","텐세컨즈",65900);
		
		prd.proModifi("블랙 소가죽 라이더자켓");
		prd.proInfo();

	}

}
