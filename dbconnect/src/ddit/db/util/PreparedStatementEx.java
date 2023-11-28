package ddit.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementEx {
	
	public static void main(String[] args) {
		dbConnect();
		
	}

	public static void dbConnect() {
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 사원번호 입력: ");
		String empNo=sc.next();
		
		final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "pc07_1";//접속자명 유의!!
		final String PASSWD = "java";
		
		Connection conn = null; 
		ResultSet rs = null;
		PreparedStatement pstmt = null; 
		String sql="select e_emp_no, e_name, e_address from employee  where e_emp_no = ? ";//입력받을 것에 ?
		//쿼리 대소문자 상관 없음
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASSWD);//객체연결설정
			pstmt=conn.prepareStatement(sql);//객체생성
			pstmt.setString(1, empNo);//입력받을 데이터타입에 맞춰서 set다음에 타입명 기술.데이터 값 입력. set메소드는 ?의 개수와 맞아야. 입력받을 개수 그대로.
			rs=pstmt.executeQuery();//쿼리 결과가 저장됨
			
			while(rs.next()) {//결과집합 중 첫번째를 꺼냄.
				System.out.println("사원번호 : "+rs.getString(1));//쿼리문의 컬럼순서
				System.out.println("사원명 : "+rs.getString(2));
				System.out.println("주소 : "+rs.getString(3));
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if(conn != null) try {conn.close();} catch(Exception e) {}
		}
	}
}