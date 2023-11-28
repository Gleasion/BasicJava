//일반 사용자 정의 예외 클래스 : Exception 클래스 상속
//사용자 정의 실행 예외 클래스: RuntimeException 클래스 상속

//예외의 강제 발생
//throw new 예외 클래스();
//throw new 예외 클래스(message);

package ddit.chap10.sec02;

public class CustomException extends RuntimeException{
	//기본생성자
	CustomException(){}
	
	CustomException(String message){
		super(message);
	}
	
}
