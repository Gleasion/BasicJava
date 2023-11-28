package ddit.db.sec01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import ddit.db.sec01.util.DBUtil;
import ddit.db.sec01.vo.EmployeeVO;

public class EmployeeDao {// Dao : 데이터베이스를 가지고 수행하는 작업을 기술해주는 부분.
	// 하나 단일의 테이블에 대한 insert 가지고 처리해주는 클래스
	// insert delete update 해주어 service로 넘김
	private static EmployeeDao instance = null;

	private EmployeeDao() {}

	public static EmployeeDao getInstance() {
		if (instance == null) instance = new EmployeeDao();
		return instance; // 싱글톤 패턴
	}

	// CRUD처리부분
	public int insert(EmployeeVO empVO) { //vo class에 있는 걸 여기로 가져온다.
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			StringBuilder sql = new StringBuilder(); // StringBuilder는 문자가 아님
			sql.append("insert into employee(e_emp_no, e_name, e_address, e_tel_no, e_position, e_department) \n");
			// 컬럼명을 반드시 써줘야하는 경우 : 기본키, 일부컬럼에 자료를 맵핑하지 않고
			sql.append(" values(?,?,?,?,?,?)"); // values가 생략되어지는 경우: 서브쿼리
			// insert문에서는 과로 생략 가능

			// 동적쿼리 명령
			pstmt = conn.prepareStatement(sql.toString()); // StringBuilder를 문자열로 변경
			pstmt.setString(1, empVO.getE_emp_no());
			pstmt.setString(2, empVO.getE_name());
			pstmt.setString(3, empVO.getE_address());
			pstmt.setString(4, empVO.getE_tel_no());
			pstmt.setString(5, empVO.getE_position());
			pstmt.setString(6, empVO.getE_department());

			int res = pstmt.executeUpdate();
			// insert, update, delete 실행시킬때 executeUpdate() 사용
			// select는 executeSQL()
			DBUtil.commit(conn);
			return res; // 레코드 수를 res에 저장 후 서비스에 반환
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return 0;
	}

	public int delete(String emp_no) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("delete from employee \n");
			sql.append(" where e_emp_no = ?");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, emp_no);
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return 0;
	}

	public int modify(String emp_no, EmployeeVO empVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("update employee \n");
			sql.append(" set e_address = ?, e_tel_no = ?, e_position = ?, e_department = ? \n");
			sql.append(" where e_emp_no = ?");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setNString(1, empVO.getE_address());
			pstmt.setNString(2, empVO.getE_tel_no());
			pstmt.setNString(3, empVO.getE_position());
			pstmt.setNString(4, empVO.getE_department());
			pstmt.setNString(5, emp_no);
			int res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return 0;
	}

	public EmployeeVO selectOne(String emp_no) {
		EmployeeVO empVO = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		   conn = DBUtil.getConnection();
		   StringBuilder sql = new StringBuilder(); // StringBuilder는 문자가 아님
		   sql.append("select e_emp_no, e_name \n");
		   sql.append(" from employee \n");
		   sql.append(" where e_emp_no = ?");
		   pstmt = conn.prepareStatement(sql.toString());
		   pstmt.setString(1, emp_no);
		   rs = pstmt.executeQuery();
		   while(rs.next()) {
			   empVO = new EmployeeVO();
			   empVO.setE_emp_no(rs.getString("e_emp_no"));
			   empVO.setE_name(rs.getString("e_name"));
		   }
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return empVO;
   }
}