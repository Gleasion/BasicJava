package ddit.chap05.sec02;

import java.util.Arrays;

public class SortAlgorithm {

	public static void main(String[] args) {
		
		//bubbleSort();
		selectionSort();
	}

	public static void bubbleSort(){
		// bubble sort(오름차순 정렬)
		// 자료의 수가 n개일때 n-1 회전 수행
		// 각 회전마다 인접된 두 자료를 비교하여 자리바꿈 수행
		
		int[] num= {25,60,45,19,38,80,95}; //비교6번
		boolean flag=false; //개선된 bubble sort 알고리즘
		
		for(int i=0; i<num.length-1; i++) { //0부터 5까지 비교 6번
			flag=false; //자리바꿈이 안일어나면 flag값 false
			for(int j=0; j<num.length-i-1; j++) { //j<num.length-i-1 끝값 제외 비교
				if(num[j]>num[j+1]) {
					flag=true; //개선된 bubble sort 알고리즘
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
			}
		}
		System.out.println((i+1)+"회전 : "+Arrays.toString(num));
		if(!flag)
			break; //개선된 bubble sort 알고리즘, 중복된 값이 안나오도록
		}
	}
		
		public static void selectionSort(){
			//선택정렬(selection sort)
			// 자료의 수가 n개 일 때 n-1회전 반드시 수행
			// 각 회전마다 왼쪽부터 기준키를 설정하고 나머지 자료를 비교
			// 매 회전마다 왼쪽부터 하나씩 자료를 비교 대상에서 제외시킴
			
			int[] num= {25,60,45,19,38,80,95}; //비교6번
			for(int i=0; i<num.length-1; i++) {
				for(int j=i+1; j<num.length; j++) {
					if(num[i]>num[j]){
						int temp=num[i];
						num[i]=num[j];
						num[j]=temp;
						}
				}
			}
			System.out.println("정렬 후 자료 :"+Arrays.toString(num));
			
		}
}
