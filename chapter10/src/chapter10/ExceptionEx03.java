package chapter10;

import java.io.IOException;

public class ExceptionEx03 {

	public static void main(String[] args) throws IOException, Exception {
		//main method에 한해서 try 블록 없이 예외미루기 가능
		
//		DataInput d1=new DataInput();
//		char ch = d1.getChar();
//		System.out.print("입력된 글자는 : "+ch);

		DataInput d2 = new DataInput();
		char ch1=' ';
//		try {
			ch1 = d2.anotherChar();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.print("입력된 글자는 : "+ch1);
	}
}

class DataInput {
	char ch;

	public char getChar() {
		System.out.print("글자 하나를 입력하세요 : ");
		try { //예외를 처리해줌
			ch = (char) System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ch;
	}
	
	public char anotherChar() throws IOException, Exception { //예외 미루기
		System.out.print("글자 하나를 입력하세요 : ");
		return (char) System.in.read();
	
	}
}