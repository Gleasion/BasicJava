package ddit.chap06.sec03;

public class Books {

	String title;
	String writer;
	int price;
	
	public Books() {}
	
	public Books(String title) {	
		this(title,"조세희",15000);
	
	}
	
	public Books(String title, String writer, int price) {
		this.title=title;
		this.writer=writer;
		this.price=price;
	}
	
	void printInfo() {
		System.out.println("책명 : \""+title+"\"\n저자 : "+writer+"\n가격 : "+price);

	}
	
	
}
