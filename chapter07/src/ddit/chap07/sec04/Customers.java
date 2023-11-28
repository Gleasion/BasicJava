package ddit.chap07.sec04;

import java.util.ArrayList;
import java.util.List; //자바 컬랙션 프래임워크에 있는 list

public class Customers {
	int bonusPoint;
	List <Product> list=new ArrayList();
	int sum=0;
	int count=0;
	
	void buy(Product p) {
		bonusPoint+=p.bonusPoint;
		list.add(p); //입력되어진 차례대로 저장됨
		sum+=p.price*p.count;
		count+=p.count;
	}

	void sumary() {
		System.out.println("[구매목록 : ]");
		for(int i=0; i<list.size(); i++) { //리스트의 사이즈
			System.out.print(list.get(i));
			System.out.print(" : " +list.get(i).price);
			System.out.println(" * " +list.get(i).count+"개");
		}
		System.out.println("-------------------------");
		System.out.println("구매금액 : "+sum+"원");
		System.out.println("보유한 보너스포인트 : "+bonusPoint);
		System.out.println("-------------------------");
	}
	
}

//	void buy(Computer com) {
//		bonusPoint=bonusPoint+com.bonusPoint;
//		list=list+" "+com.toString();
//		sum=com.price;
//	}	

//	void buy(Tv tv) {
//		bonusPoint=bonusPoint+tv.bonusPoint;
//		list=list+" "+tv.toString();
//		sum=tv.price;
//	}
	
//	void buy(Audio ad) {
//		bonusPoint=bonusPoint+ad.bonusPoint;
//		list=list+" "+ad.toString();
//		sum=ad.price;
//	}
	
