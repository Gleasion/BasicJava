package ddit.chap10.sec02;

public class ArgsExample {

	public static void main(String[] args) {
		String str1=null;
		String str2=null;
		try {
			str1=args[0];
			str2=args[1];
			int v1=Integer.parseInt(str1);
			int v2=Integer.parseInt(str2);
			int res=v1+v2;
			System.out.println("합계 : "+res);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행매개변수의 수가 부족");
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("프로그램을 다시 시작하세요.");
		}

	}

}
