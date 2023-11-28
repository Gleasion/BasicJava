package ddit.chap06.sec02;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack s1=new MyStack();
		
		s1.pushDown('H');
		s1.pushDown('a');
		s1.pushDown('t');
		System.out.print(s1.popUp());
		System.out.print(s1.popUp());
		System.out.print(s1.popUp());
	}

}

class MyStack{
	private char[] stack;
	private int top;
	
	public MyStack() {
		stack=new char[10];
		top=-1; //top=0;을 쓸수 있어서 -1을 하여 비어있다는 것으로 설정
	}
	
	public void pushDown(char ch) { //입력
		if(++top>=stack.length) { 
			//++t 1증가 해주고 반환
			//t++ 반환해주고 1증가
			System.out.println("stack overflow");
			System.exit(0); //break보다 강력한 프로그램 실행 종료
		}else {
			stack[top]=ch;
		}
	}
	
	public char popUp() { //호출한 쪽에 되돌려줘야함, 반환 타입이 char
		if(top<0) {
			System.out.println("stack underflow");
			return ' '; //return 타입이 0이면 안되고 무조건 줘야함 => 공백으로(NULL값 못씀)
		}else {
			return stack[top--]; //반환해주고 자기자신 1감소
		}
	}
}