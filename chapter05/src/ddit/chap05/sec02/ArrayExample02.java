package ddit.chap05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {
		//5개의 정수를 배열에 저장하고 최대값과 최소값을 구하시오.
		//int[] number= {45,90,140,75,17};
		//getMinMax(number);
		
		//exchangeData();
		
		getLottoNumber();
	}

	public static void getMinMax(int[] number) { //매게변수
		int tempMax=number[0]; //임시최대값
		int tempMin=number[0]; //임시최소값
		
		for(int i=1; i<number.length; i++) { //i=1인 이유 자기자신[0]으로 임시값을 만들어둠
			if(tempMax<number[i]) { //임시최대값과 새로 들어온 값 비교
				tempMax=number[i]; //임시최대값은 새로 들어온 값
			}
			if(tempMin>number[i]) { //임시최소값과 새로 들어온 값 비교
				tempMin=number[i]; //임시최소값은 새로 들어온 값
			}
		}
		System.out.println("최대값 : "+tempMax);
		System.out.println("최소값 : "+tempMin);
		
	}
	
	public static void exchangeData() {
		//다음 5명의 이름을 배열에 저장하고, 첫번째 사람과 마지막 사람의 저장위치를 바꾸시오.
		String[] name={"홍길동","강감찬","이순신","박지원","정몽주"};
		System.out.println("원본배열 : "+Arrays.toString(name));
		
		String temp=name[0];
		name[0]=name[4];
		name[4]=temp;
		
		System.out.println("변경된 배열 : "+Arrays.toString(name));
	
	}
	
	public static void getLottoNumber() {
		// 로또 번호를 생성하라.
		// 난수를 이용하면 중복된 값이 나올 가능성이 있음		
		int[] lotto=new int[45];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=i+1;
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.print("구매할 장수 입력 : "); //"구매할 액수를 1000원 단위로 입력 : "
		int jang=sc.nextInt(); // int money=sc.nextInt();
								// int idx=money/1000;
		
		for(int i=0; i<jang; i++) { //for(int i=0; i<idx;, i++);
			int[] res=shuffle(lotto); // void로 하면 shuffle;
			System.out.print((i+1)+"장 : "); //(i+1)*1000+"원 : "
			for(int j=0; j<6; j++) {
				System.out.printf("%3d",res[j]); //void로 하면 "%3d",lotto[j]"
			}
			System.out.println();
		}
		
	}
		public static int[] shuffle(int[] lotto) { //public static void로 쓰면 return lotto; 필요없음
			//배열초기화
			for(int i=0; i<1000000; i++) {
				int rnd=(int)(Math.random()*lotto.length); //0<=rnd<=44
				int temp=lotto[0];
				lotto[0]=lotto[rnd];
				lotto[rnd]=temp;
			}
		return lotto;
		}
}
