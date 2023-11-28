package ddit.chap05.sec02;

import java.util.Random;
import java.util.Scanner;

public class WordScreambleEx {

	public static void main(String[] args) { //void 되돌려주는 값 없음
		WordScramble w=new WordScramble();
		String word=w.wordSelection(); // 섞이지 않음
		String question=w.shuffle(word);
		System.out.println("제시어 :"+question);
		w.answer(word);
	}
}

class WordScramble{
	//5개의 단어를 제공하여 임의의 단어를 선택
	//제시어는 선택된 단어의 철자를 섞어 제시함
	//ex) hope를 o p h e 처럼 철자 섞어서 제시 후 맞으면 맞도록 틀리면 틀리도록 만들기,,,
	//사용자가 정답으로 입력한 단어와 선택된 제시단어를 비교하여 같은 단어가 입력될때까지
	//입력을 요구하여 맞추면 시도횟수도 출력
	String[] words={"apple","banana","persimmon","orange","hope"};
	
	public String wordSelection() {
		Random random=new Random();
		int rnd=random.nextInt(5); //0부터 5보다 작은 난수 발생
		return words[rnd];
	}

	
	public String shuffle(String str) {
		char[] ch=str.toCharArray(); //문자열을 문자배열로 변환시켜줌
		for(int i=0; i<1000; i++) {
			int rnd=(int)(Math.random()*ch.length); // 0<rnd<4
			char temp=ch[0];
			ch[0]=ch[rnd];
			ch[rnd]=temp;
		}
		return new String(ch); //문자배열을 문자열로 바꿈
		//.toCharArray <->new String
	}

	public void answer(String word) {
		Scanner sc=new Scanner(System.in);
		int count=0; //시도횟수
		
		while(true) {
			count++;
			System.out.print("정답 : ");
			String str=sc.nextLine();
			
			if(word.equals(str)) { //문자열 내용 비교(대소문자 완벽하게)
				//.equlsignorecase() 대소문자 구분없이 문자열 내용 비교
				System.out.println("**********************");
				System.out.println("정답입니다.");
				System.out.println("시도횟수 : "+count);
				System.out.println("**********************");
				break;
			}else {
				System.out.println("**********************");
				System.out.println("정답이 아닙니다.");
				System.out.println("**********************");
			}
		}

	}
}