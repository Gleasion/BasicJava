package ddit.chap03.sec01;

public class IncreamtStatement {

	public static void main(String[] args) {
		// 증감연산자(++,--)
		// 1씩 증가(감소)
		// 단항 연산자
		// 후위식 변수++, 전위식 ++변수(변수 자체의 값은 동일)
		// 연산 결과를 할당할 때는 다른 값을 반환
		int num=10;
		int res=num++; //num 값을 증가하기 전에 값을 먼저 할당후 더해줌
		
		num=10;
		res=++num; //먼저 증가하고 할당
		
		System.out.println("num="+num);
		System.out.println("res="+res);
		
		//1~100사이의 값을 모두 더하여 출력하여라.
		int sum=0;
		
		for(int i=1; i<=100; i++) { //for 반복,, 1부터 100까지를 1씩 더해라.
			sum+=i;
		}
		System.out.println("1-100까지의 합 = "+sum);
		
	}

}
