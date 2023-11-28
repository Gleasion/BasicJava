package ddit.db.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
	private static DBConnect instance = null;
	
	private DBConnect() {}
	
	public static DBConnect getInstance() {
		if(instance == null) instance = new DBConnect();
		return instance;
	}
	
	private final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private final String USER = "hr";
	private final String PASSWD = "java";
	
	private Connection conn = null;
	
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWD);
		}catch(SQLException e) {
			e.printStackTrace();
		} //연결을 끊고 가기 때문에finally close 없애야 함		
		return conn;
	}
}
