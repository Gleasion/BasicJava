package chapter10;

public class ExceptionEx02 {
	
	public static void main(String[] args) {
		int sum=0;
		
		try {
			int i=0;
			while(true) {
				i++;
				if(i%20==0) { //20의 배수이면
					i=0;
				}
				sum=sum+(20/i);
//			System.out.println("1234");
//			System.out.println("5678");
			}
			//ArithmeticException
			
		}catch(NumberFormatException e) {
			e.printStackTrace();			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace(); //at chapter10.Exception2.main(Exception2.java:16)
			System.out.println(e.getMessage());
		}
		
		System.out.println("sum="+sum);
		System.out.println("프로그램실행 종료");
	}
	
	
}

