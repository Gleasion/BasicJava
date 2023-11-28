package ddit.chap10.sec01;

import java.util.List;

public class DBTest {

	public static void main(String[] args) {
		DBConnection db1=new DBConnection();
		CartVO cart=new CartVO();
		String sql="select * from CART";
		List list=db1.selectAll(sql);
		//build up 클래스 사용
		
		for(int i=0; i<list.size(); i++) {
			cart=(CartVO)list.get(i);
			System.out.printf("%5s %15s %12s %5d \n",
					cart.getCartMember(),cart.getCartNo(),cart.getCartProd(),cart.getCartQty());
		}
		
		
	}

}
