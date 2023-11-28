package ddit.chap03.sec01;
import java.util.Scanner;
public class Practice01 {
	
	int scissors=1;
	int rock=2;
	int paper=3;
	
	public static void main(String[] args) {
		// Q1.컴퓨터와 가위 바위 보게임을 하는 프로그램 작성(1-> 가위, 2->바위, 3->보)
		
		method();
	}
	
	public static void method() {
		System.out.print("가위:1, 바위:2, 보:3 => 입력 : ");
		Scanner sc=new Scanner(System.in);
		int user=Integer.parseInt(sc.nextLine());
		
		int computer=(int)(Math.random()*3+1);
		
		if(user==computer) {
			System.out.println("비겼습니다.");
		}else if(user==(computer+1)%3+1) {
			System.out.println("사용자:"+user+", 컴퓨터: "+computer+"=> 사용자 승리");
		}else { 
			System.out.println("사용자:"+user+", 컴퓨터:"+computer+"=> 컴퓨터 승리");
		}
		 
		
	}
		
}


