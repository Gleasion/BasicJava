 package ddit.chap02.sec01;

public class StringExample02 {

	public static void main(String[] args) {
	
	 //method1(); // 글자가 약간 누우면 뒤의 method가 static이서여,,,
	 escapeSequence();
	
	}
	
	public static void method1() {
	
	// String 타입의 자료에 사용되는 '+'연산자 : 자료를 결합하여 새로운 문자열 자료 생성
		// any type+"문자열" => "문자열"+"문자열" => "문자열문자열"

		String str1="대전시";
		String str2=str1+" 중구 ";
		System.out.println(str2);
		
		int loc=846;
		str2 = str2+loc; //문자열 +정수 => 문자열+문자열
		System.out.println(str2);
		System.out.println("5"+55);
	
	}

	
	public static void escapeSequence() {
		// \t : tab키
		// \n : 줄바꿈 new line
		// \r : enter키 현재 줄의 첫번째 위치로 이동(줄바꿈 X)
		// \b : backspace키
		// \\ : '\'출력
		// \" : "를 출력
		// \' : '를 출력
		
		String str1="대전시";
		String str2="중구";
		String str3="(재)대덕인재개발원";
		
		System.out.println(str1+"\t"+str2+"\n"+str3);
		System.out.println("\""+str3+"\"");
		System.out.println("\'"+str1+"\'");
		
	
	}
		
}

	
	
	
