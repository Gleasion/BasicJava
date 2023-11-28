package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열복사 ①깊은복사(deep copy) ②옅은복사(shallow copy)
	
		// 2.옅은복사(shallow copy) : 배열의 주소값을 복사, 배열공간을 공동으로 사용 -> side effect 복사
		int[] source={10,20,30,40,50};
		System.out.println("원본배열 : "+Arrays.toString(source));
		int[] target=source; //주소 전달됨 source와 target은 공간을 공동으로 사용함
		target[3]=999;
		System.out.println("복사배열 : "+Arrays.toString(target));
		
		
		// 1.깊은복사(deep copy) : 배열공간이 따로 만들어짐, 독립적, 서로 영향이 없음
		//for문을 만들어서 하나하나씩 옮겨줌, System.arraycopy()사용, Object class가 가지고 있는 clone method 이용
		
		//1-1. for문을 이용하는 방법
		int[] dest1=new int[10];
		for(int i=0; i<source.length; i++) {
			dest1[i]=source[i];
		}
		System.out.println(Arrays.toString(dest1));
		System.out.println(Arrays.toString(source));
		
		//1-2. System.arraycopy() 사용
		//		System.arraycopy(source배열명,복사시작위치,복사받을배열명,복사받을위치, 복사해줄 자료수)
		int[] dest2=new int[5];
		System.arraycopy(source, 1, dest2, 2, 3);
		System.out.println(Arrays.toString(dest2));
		System.arraycopy(source, 0, dest2, 0, source.length);
		System.out.println(Arrays.toString(dest2));
		
		//1-3. clone() 사용
		int[] dest3=source.clone();
		System.out.println(Arrays.toString(dest3));
		
	}
	
}
