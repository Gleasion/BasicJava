package ddit.chap05.sec01;

public class ArrayTest01 {

	public static void main(String[] args) {
		//기본타입
		/* 정수: byte(1), short(2), int(4), long(8)
		     실수: foalt(4), double(8)		
		 */
		//String타입의 str 변수에 개똥이 데이터를 할당(입력,대입)
		//String[]: String 타입의 배열(1차원)
		//String[][]: String 타입의 배열(2차원)
		String str="개똥이";
		char ch='a';
		//                   0      1      2      3      4       5
		String[] strArr= {"개똥이","김철수","이나은","윤종민","송기돈","임찬빈"};
		System.out.println(strArr[0]);
		System.out.println(strArr[3]);
		//System.out.println(strArr[6]); data 없어서 오류
		
//		System.out.println(strArr.length);
//		for(int i=0; i<6; i++) {
//			System.out.println(strArr[i]);

		//향상된 for문
		for(String s : strArr) {
			System.out.println(s);
		}
		
		System.out.println(strArr.length);
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
			
			
			
		}
		
	}

}
