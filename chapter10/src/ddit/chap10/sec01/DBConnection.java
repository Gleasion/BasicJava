package ddit.chap10.sec01;

import java.sql.Connection; //sql
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe"; //localhost 변경
	private final String USER="pc07";
	private final String PASSWD="java";
	
	//클래스 객체
	private Connection conn=null;
	private Statement stmt=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private List <CartVO> list=new ArrayList();
	
	public List selectAll(String sql) { //보통 list객체나 vo객체 써줌 
		CartVO cartvo=new CartVO();
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWD); //여기까지 로그인 완료
			//누워있음 getConnection static 타입
			//DriverManager클래스파일
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			//.executeQuery : select
			// .executeUpdate : delete... etc..
			while(rs.next()) {//있으면 가져오기..
				cartvo.setCartMember(rs.getString("CART_MEMBER"));
				//index가 java와 달라서 ()안에 컬럼명을 써줌
				//varchar2, varchar, char= String
				cartvo.setCartNo(rs.getString("CART_NO"));
				cartvo.setCartProd(rs.getString("CART_PROD"));
				cartvo.setCartQty(rs.getInt("CART_QTY"));
				// double, float, get
							
				list.add(cartvo);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally { //DB 연동시 필수로 작성해야함 아니면 오류남
			if(rs != null) try {rs.close();}catch(Exception e) {}
			//rs.close(); 쓰려면 try-catch 블록 사용해야함,, 사용 안하면 오류
			if(stmt != null) try {stmt.close();}catch(Exception e) {}
			if(conn != null) try {conn.close();}catch(Exception e) {} 
			//(Exception e) {} body에 안적어 줘도 됨요
		}
		return list;
	}
}
