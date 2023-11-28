package ddit.chap06.sec04;

public class AddExample {

	public static void main(String[] args) {
		
		Add a1=new Add();
		a1.add(50,110.0);
		
		a1.printInfo(); //void
		System.out.println(a1.add(200, 800));
		//System.out.println(a1.add(50,110.0)); // 반환이 안되어 여기서 출력안됨
	}
}

class Add{
	
	public void add(int a1, double a2) { //반환하지 않아서 무조건 여기서 인쇄해야함
		System.out.println("덧셈 : "+(a1+a2));
	}
	
	public int add(int a1, int a2) { //반환을 해야함, 호출되어진 다른 클래스에서 인쇄해야함
		return a1+a2;
	}
	
	public void printInfo() {
		int res=add(20,30); // 위에 것 부름,,
		System.out.println("덧셈 : "+res);
	}
}