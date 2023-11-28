package ddit.chap03.sec01;
import java.util.Scanner;
public class Practice02 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		/* Q2. 누진 수도요금 계산
		다음 조건을 참고하여 수도요금을 계산하여 출력하시오.
		[사용량에 따른 톤당 요금단가]
		1-10 톤 : 170원
		11-19 톤 : 230원
		20-29 톤 : 330원
		30-39톤 : 480원
		그 이상  : 700원
		ex)26톤을 씀 -> 5,980원
		
		[하수도 요금] 
		사용량 * 350원

		[수도요금]
		수도사용 요금+하수도 요금
		//부가가치세 *0.1(10%)
*/
		method1();
		method2();
	}
	
	public static void method1() {		
		System.out.print("수도 사용량 입력 : ");
		int usage=Integer.parseInt(sc.next());
		
		int water=(usage<=10)? usage*170 : ((usage<20)? 10*170+(usage-10)*230 : 
			((usage<30)? (10*170)+(9*230)+(usage-19)*330 : ((usage<40)? 10*(170+330)+(9*230)+(usage-29)*480
								: 10*(170+330+480)+(9*230)+(usage-39)*700))); //수도요금
		
		int sewage=usage*350; //하수도 요금
		double vat=(water+sewage)*0.1; //부가가치세
		int tax=water+(int)vat;
		
		//System.out.println(water);
		//System.out.println(sewage);
		//System.out.println(vat);
		//System.out.println(tax);
		System.out.println("수도사용요금은 "+tax+"원 입니다.");
	}
		
	public static void method2() {
		System.out.print("수도 사용량 입력 : ");
		int usage=Integer.parseInt(sc.next());
		
		int sewage=usage*350; //하수도 요금
		
		if(usage<=10) {
			int water=usage*170;
			double vat=(water+sewage)*0.1; //부가가치세
			int tax=water+(int)vat;
			System.out.println("수도사용요금은 "+tax+"원 입니다.");
		}else if(usage<20) {
			int water=10*170+(usage-10)*230;
			double vat=(water+sewage)*0.1; //부가가치세
			int tax=water+(int)vat;
			System.out.println("수도사용요금은 "+tax+"원 입니다.");
		}else if(usage<30) {
			int water=(10*170)+(9*230)+(usage-19)*330;
			double vat=(water+sewage)*0.1; //부가가치세
			int tax=water+(int)vat;
			System.out.println("수도사용요금은 "+tax+"원 입니다.");
		}else if(usage<40) {
			int water=10*(170+330)+(9*230)+(usage-29)*480;
			double vat=(water+sewage)*0.1; //부가가치세
			int tax=water+(int)vat;
			System.out.println("수도사용요금은 "+tax+"원 입니다.");
		}else {
			int water=10*(170+330+480)+(9*230)+(usage-39)*700;
			double vat=(water+sewage)*0.1; //부가가치세
			int tax=water+(int)vat;
			System.out.println("수도사용요금은 "+tax+"원 입니다.");
		}
		
	}	
		

}

