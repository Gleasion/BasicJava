package ddit.chap04.sec03;

public class PracticeWhile {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=총합 출력

		method1();
	}

	public static void method1() {
		String res="";
		int sign=-1;
		int cnt=1;
		int sum=0;
	
		while(cnt<11){ //내부에 제어변수 넣어줌
		sign=sign*(-1);
		sum=sum+(cnt*sign);
			if(sign>0 && cnt!=1) {
				res=res+"+"+cnt;
			}else {
				res=res+(cnt*sign);
			}
		cnt++;
		}
		System.out.println(res+"="+sum);
	}
	
}

