package ddit.chap07.sec06;

public abstract class Shape {
	protected String type;
	
	public Shape() {}
	
	public Shape(String type) {
		this.type=type;
	}
	
	public abstract void draw();
	
}

class Figure extends Shape{
	private String name;
	
	public Figure() {}
	
	public Figure(String type, String name) {
		super(type);
		this.name=name;
	}
	
	@Override
	public void draw() {
		System.out.println(name+" 객체를 그립니다.");
	}
}