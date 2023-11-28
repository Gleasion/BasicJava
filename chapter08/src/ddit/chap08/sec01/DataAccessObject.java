package ddit.chap08.sec01;

public interface DataAccessObject {
	void select(); //public abstract 생략
	void insert(); //Override시 접근지정자 지정 주의
	public void update();
	public void delete();
	//default로 선언된 method는 자동적으로 public abstract -> 재정의 시 넓은 접근지정자로 해야함
	
	
	
}
