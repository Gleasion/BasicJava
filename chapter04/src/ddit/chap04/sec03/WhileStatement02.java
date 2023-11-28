package ddit.chap04.sec03;

public class WhileStatement02 {

	public static void main(String[] args) {
		// 첫 날에 100원, 둘째날부터 저날의 2배씩 저축하여
		// 최초로 100만원을 넘는 날수와 그때까지 저축한 금액을 출력하시오.
		
		int days=1; //날수
		int money=100; //매일 저축할 금액
		int sum=0; //저축 총액
		
		while(true) { //무한루프 for(;;){}
			sum=sum+money;
			if(sum>=1000000) {
				break; //if가 포함된 while문을 벗어남(반복문)
			}else {
				money*=2;
				days++;
			}
		}
		System.out.println("경과일수 : "+days);
		System.out.println("저축금액 : "+sum);
	}

}
