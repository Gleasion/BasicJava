package ddit.chap07.sec04;

public class Product {
	int price;
	int bonusPoint;
	int count;
	
	public Product(){}
	public Product(int price, int count){
		this.price=price;
		this.count=count;
		this.bonusPoint=(price*count)/10;
	}
}

class Tv extends Product{
	
	public Tv(int price, int count) {
		super(price,count);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	
	public Computer() {}
	public Computer(int price, int count) {
		super(price,count);
	}
	
	@Override
	public String toString() { //object class꺼 상속 후 재정의
		return "COMPUTER";
	}
}

class Audio extends Product{
	public Audio() {}
	public Audio(int price, int count) {
		super(price, count);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
	
}
