package ddit.chap10.sec02;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
		test();
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void test() throws CustomException{
		throw new CustomException("사용자 정의 예외입니다.");
		
	}
	
}
