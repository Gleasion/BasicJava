package ddit.chap08.sec03;

public interface Customer {
	String getOrder();
	
}

class CustomerA implements Customer{

	@Override
	public String getOrder() {
		return "홍길동 손님에게 김치찌게를 제공합니다.";
	}

}


class CustomerB implements Customer{
	
	@Override
	public String getOrder() {
		return "이순신 손님에게 김치찌게를 제공합니다.";
	}
	
}
