package ddit.db.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class PreparedStatementExample {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu() {
		System.out.println("     [ MENU]     ");
		System.out.println("---------------------");
		System.out.println(" [1]. 사원 신규 등록");
		System.out.println(" [2]. 사원 정보 수정");
		System.out.println(" [3]. 퇴직 사원 관리");
		System.out.println(" [4]. 사원조회");
		System.out.println(" [0]. 종      료");
		System.out.println("---------------------");
		System.out.println("작업 번호 : ");
		int menu = Integer.parseInt(sc.nextLine());
		switch(menu) {
		case 1: 
			insertEmp();
			break;
		case 2:
			updateEmp();
			break;
		case 3:
		case 0:
		default :
			System.out.println("잘못된 작업번호 입니다...");
		}
	}
		
	public static void insertEmp() {
		DBCrud crud = new DBCrud();
		StringBuilder sql = new StringBuilder();
		sql.append("insert into employees(employee_id, emp_name, department_id, job_id) ");
		sql.append(" values(seq_empid.nextval, ?, ?, ?) ");
		int count = crud.insert(sql.toString());
		
		if(count>0) {
			System.out.println("자료가 정상적으로 저장되었습니다.");
		}else {
			System.out.println("자료 저장에 실패했습니다..");
		}
	}
	
	public static void updateEmp() {
		DBCrud crud = new DBCrud();
		Map<String, Object> map = new HashMap<String, Object>();
				
		while(true) {
			String email = null;
			System.out.print("이메일 입력 : ");
			email = sc.nextLine();
			if(email.length() != 0) {
				map.put("EMAIL", email);
			}else {
				break;
			}
		}
		
		while(true) {
			String phoneNum = null;
			System.out.print("전화번호 입력 : ");
			phoneNum = sc.nextLine();
			if(phoneNum.length() != 0) {
				map.put("PHONE_NUMBER", phoneNum);
			}else {
				break;
			}
		}
		
		while(true) {
			String jobId = null;
			System.out.print("직무코드 입력 : ");
			jobId = sc.nextLine();
			if(jobId.length() != 0) {
			map.put("JOB_ID", jobId);
			}else {
				break;
			}
		}
		
		int salary = 0;
		System.out.print("급여 입력 : ");
		salary = sc.nextInt();
		if(salary != 0) {
			map.put("SALARY", salary);
		}
			
		double commPct = 0.0;
		System.out.print("영업실적 입력 : "); //영업실적 코드
		commPct = sc.nextDouble();
		if(commPct != 0.0) {
			map.put("COMMISSION_PCT", commPct);
		}
		
		int deptId = 0;
		System.out.print("부서코드 입력 : ");
		deptId = sc.nextInt();
			map.put("DEPARTMENT_ID", deptId);
		
		crud.update(map);
	}
}	

class DBCrud{
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Scanner sc = new Scanner(System.in);
			
	DBConnect dbconn = DBConnect.getInstance();
	Connection conn = dbconn.getConnection();
	
	public int insert(String sql) {
		int result = 0;
		try {
			System.out.print("사원명 : ");
			String empName = sc.nextLine();
			
			System.out.print("부서번호(10~270) : " );
			int deptId = Integer.parseInt(sc.nextLine());
			
			System.out.print("직무코드 : ");
			String jobId = sc.nextLine(); //외래키
			System.out.println("---------------------------");
			
			System.out.print("위 자료를 저장할까요?(y/n) ");
			String flag = sc.next();
			
			if(flag.equalsIgnoreCase("y")) { //대문자 소문자 상관 없이 내용비교
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,empName); //첫번째 물음표
				pstmt.setInt(2,deptId); // 두번째 물음표
				pstmt.setString(3,jobId); // 세번째 물음표
				
				result = pstmt.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) try {pstmt.close();}catch(Exception e) {}
			if(conn!=null) try {pstmt.close();}catch(Exception e) {}
		}
		return result;
	}
	
	public void update(Map<String,Object> map) {
		System.out.println("수정할 사원번호 : ");
		String memId = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append("update employees \n");
		sb.append(" set ");
		
		// 자료가 있으면 꺼내 Entry에 넣으세요
		Iterator<Map.Entry<String, Object>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Object> entry = iter.next();
			sb.append(entry.getKey()); //컬럼명 뽑힘
			sb.append(" = ");
			if(entry.getKey().equals("EMAIL") || entry.getKey().equals("PHONE_NUMBER") ||
				entry.getKey().equals("JOB_ID")) {
				sb.append("'");
				sb.append(entry.getValue()); // 값이 뽑힘
				sb.append("',\n");
			}else {
				sb.append(entry.getValue());
				sb.append(",\n");
			}
			
		}
		
		String sql = sb.toString();
		sql = sql.substring(0, sql.length() - 2);
		sql = sql + "\n where MEM_ID = ?";
		
		System.out.println(sql);
		//pstmt.setString(1, memId);
	}
	
}

