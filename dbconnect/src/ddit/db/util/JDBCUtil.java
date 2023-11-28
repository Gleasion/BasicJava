
//1. ojdbc6.jar 파일을 project -> properties -> java build path -> Libraries의 add external jars에 등록

package ddit.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JDBCUtil {
	private static JDBCUtil instance=null;//싱글톤패턴(single ton pattern). 
										//여러번 생성해도 딱 하나의 객체만 만들어짐.
	private JDBCUtil() {}
	
	public static JDBCUtil getInstance() {
		//1.싱글톤패턴의 해당 클래스 객체를 만들기 위해 자신과 같은 타입의 정적변수를 선언, 
		//2.프라이빗 접근 지정자를 가진 생성자 메소드,
		//3.외부에서 호출하기 위해 getInstance()를 씀->public. 객체의 생성여부를 판단한 뒤 
		// 미생성시 생성해서 반환. 생성되어있다면 생성되어 있는 주소 반환.
		// 이 경우 static이므로 객체는 절대 2개 이상 만들어지지 않음. 
		
		if(instance==null) instance=new JDBCUtil();
		//객체가 null이면(생성되어 있지 않다면) 만들어주고
		return instance;//null이 아니면 이미 생성되어 있는 주소값 반환.
		//그러나 if문에서 객체 미존재시 최초로 한번 생성했으므로 그 이후로는 절대 인스턴스가 null이 되지 않음.=>절대 중복생성되지 않음
	}//★★위의 public~여기까지는 공식처럼 외워둬야 함. db연결할때 싱글톤 패턴 많이 씀!!
	 //if문~ 이후의 내용은 여러가지 방법이 있지만 위에서 기술한 방법이 가장 기본적인 방법.
	
	
//2. URL 설정
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	//@localhost에 접속하려고 하는 서버의 ip주소를 입력하면 해당 컴퓨터에 접속 가능. 1521은 오라클에 부여된 논리적 포트번호. xe는 무료버전이라는 뜻. 실제 정식버전은 orcl을 써야.
	
	//thin 방식과 OCI 방식
	//1) thin 방식->많이 사용하는 방식
	//  - 순수하게 자바 패키지만으로 db와 연결 설정
	//  - 범용적이지만 OCI보다 속도가 느리다.
	//2) OCI 방식
	//  - '.DLL'과 '.SO'파일과 같이 특정 운영체제 내에서만 수행되는 Native module을 통하여 db에 접속
	//  - 하드웨어 또는 소프트웨어 전용 모듈을 사용하여 db에 접속하므로 속도는 빠르나 범용성이 없음
	
	private final String USER = "pc08";
	private final String PASSWD = "java";
	//db 사용자 ID와 password
	
	private Connection conn = null; //연결객체
	private ResultSet rs = null; //결과값 보관 객체-인서트 업데이트 딜리트는 결과값이 필요없으므로 리절트셋 변수가 필요x
	private PreparedStatement pstmt = null; //동적 명령어 객체.->정적명령어객체가 가진 기능을 모두 처리 가능. 자바프로그램이 실행될 때에 필요한 자료를 입력받음.
	//statement:정적명령어객체. 이미 있는 데이터를 조회하는 ~.
	// ㄴ> select * from employee where e_emp_no='A001';의 경우 A001이 이미 입력되어 있고 이를 토대로 데이터를 찾는 것->정적
	//컴파일 할때는 ?만 전달. 콘솔창에서 사용자가 데이터를 입력하면 그게 동적명령어
 //=>필수적인 3가지 객체
	
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> result = null;//키가 스트링, 밸류가 클래스타입인 맵을 제한타입으로 가지는 리스트
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			//연결설정(url, db 사용자 계정, db 사용자 암호 필요)
			//드라이브매니저는 디비와 연결해주는 클래스. 객체를 생성하지 않고 클래스이름.메소드()방식으로 호출하면 메소드는 static. 겟커넥션->스태틱이다.
			
			pstmt=conn.prepareStatement(sql);
			//정의된 쿼리문에 의한 명령 객체 생성(동적쿼리: 필요한 정보를 실행 시간에 제공 받는 쿼리)
			for(int i=0; i<param.size(); i++) {
				pstmt.setObject(i+1, param.get(i));
				//쿼리실행에 필요한 매개변수를 List에 담아 제공 받아 동적쿼리에 사용된'?'와 대응 시킴
				//ex)sql="select * from member mem_id = ? and mem_job = ?"로 구성되었다면
				// List에 담겨진 매개변수는 앞의 '?'에 사용될 회원ID와 회원직업 비교에 사용될 직업이 저장되어 전달되므로
				//pstmt.setString(1, param.get(1))
				//pstmt.setString(2, param.get(2))이 되어야 
				//sql="select * from member mem_id = param.get(1) and mem_job = param.get(2)"이 됨
				
			}
			rs=pstmt.executeQuery();
			//동적쿼리 실행
			ResultSetMetaData rsmd=rs.getMetaData();
			//결과집합객체의 메타데이터(컬럼명, 컬럼수 등) 사용 객체 생성
			int columnCount=rsmd.getColumnCount(); //컬럼의 수
			while(rs.next()) {//결과집합의 각 행마다
				if(result==null) 
					result=new ArrayList<>(); //각 행들을 보관할 객체
					Map<String, Object> row=new HashMap();//각 행(테이블 컬럼명과 데이터)을 구성하는 자료 저장
					for(int i =1; i<=columnCount; i++) {//각각의 행에 포함된 열마다
						String key=rsmd.getColumnLabel(i); //db테이블의 컬럼명
						Object value=rs.getObject(i); //db테이블의 컬럼에 해당하는 데이터
						row.put(key, value); //각 행마다 (컬럼명,데이터)형식으로 저장
					}
					result.add(row); //각 행을 하나의 자료로 저장하여 반환
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
				if(conn != null) try {conn.close();} catch(Exception e) {}
			}
			return result;
					
		}
	}
	

