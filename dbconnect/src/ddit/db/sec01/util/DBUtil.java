package ddit.db.sec01.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			System.out.println("[error] : JDBCTemplate Driver");
			e.printStackTrace();
		}
		
		final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "pc07_1";
		final String PASSWD = "java";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			conn.setAutoCommit(false); //자동커밋을 위함, false로 함
			//true 놓으면 하단에 commit 메소드 필요가 없음
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try {
			conn.commit();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
}
