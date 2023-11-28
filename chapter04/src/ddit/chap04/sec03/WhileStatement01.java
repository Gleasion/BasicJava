package ddit.chap04.sec03;

public class WhileStatement01 {

	public static void main(String[] args) {
		
		method1();
		method2();
		
	}
		
	public static void method1(){
		int numOfChop=0; //도끼질의 횟수
		while(numOfChop<10) {
			numOfChop++;
			System.out.println("나무를 "+numOfChop+"번");
			if(numOfChop !=10) {
				System.out.println("아직 안넘어 갔습니다...\n\n");
			}
		}
		System.out.println("드디어 나무가 넘어갔습니다..");
	}
	
	public static void method2() {
		int numOfChop=10; //도끼질의 횟수
		do {
			numOfChop++;
			System.out.println("나무를 "+numOfChop+"번");
			if(numOfChop !=10) {
				System.out.println("아직 안넘어 갔습니다...\n\n");
			}		
		}while(numOfChop<10);
		System.out.println("드디어 나무가 넘어갔습니다..");
	}

}