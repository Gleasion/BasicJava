package ddit.chap01.report;

public class DiceExample {

	public static void main(String[] args) {
		Dice d=new Dice();
		d.throwDice();
		d.printDiagram();
		d.transtwoDim();
	}
}

class Dice{
	int[] dice=new int[6];
	
	public void throwDice() {
		for(int i=0; i<50; i++) {
			int rnd=(int)(Math.random()*dice.length);
			dice[rnd]++; //1씩 증가
		}
	}
	
	public void printDiagram() {
		for(int i=0; i<dice.length; i++) {
			System.out.print((i+1)+"|");
			for(int j=0; j<dice[i]; j++) {
				System.out.print("*");
			}
			System.out.println("("+dice[i]+")");
			}
	}


	public void transtwoDim() {
		int rowNum=dice[0];
		for(int i=0; i<dice.length; i++) {
			if(rowNum<dice[i]) rowNum=dice[i]; //최대값 구하는 것,,
		}
		
		char[][] charDice=new char[rowNum][6];
			for(int j=0; j<dice.length; j++) {
				for(int i=0; i<dice[j]; i++) {
					charDice[i][j]='*';
				}
			}
			
		for(int i=rowNum-1; i>=0; i--) {
			System.out.printf("%2d| ",i+1);
			for(int j=0; j<charDice[i].length; j++) {
				System.out.print(charDice[i][j]+"  ");
			}
			System.out.println();			
		}
		System.out.println("-------------------------");
		System.out.println("    1  2  3  4  5  6");
	}
	
}

