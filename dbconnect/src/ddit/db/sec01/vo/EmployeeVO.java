package ddit.db.sec01.vo;

public class EmployeeVO {
	// VO class 데이터 보관용
	// 멤버변수는 저장하려는 컬럼 수
	// 오라클은 문자가 없으므로 String 클래스를 이용하여 문자열 저장
	// 사용자가 입력한 정보를 보관하여 Dao에 넘겨줌
	
	// data가 담아지는 클래스
	// 반드시 요구되어지는 항목: E_EMP_NO, E_NAME
	// null 체크하면 데이터 insert 할 때 반드시 다 넣어야함
	// not null은 안넣어도 작동 함
	
	private String e_emp_no;
	private String e_name;
	private String e_address;
	private String e_tel_no;
	private String e_position;
	private String e_department;
	
	public EmployeeVO(){} //data transe object dtd라고도 씀
	
	public EmployeeVO(String e_emp_no, String e_name, String e_address,
				String e_tel_no, String e_position, String e_department){
		this.e_emp_no = e_emp_no;
		this.e_name = e_name;
		this.e_address = e_address;
		this.e_tel_no = e_tel_no;
		this.e_position = e_position;
		this.e_department = e_department;
	}

	public String getE_emp_no() {
		return e_emp_no;
	}

	public void setE_emp_no(String e_emp_no) {
		this.e_emp_no = e_emp_no;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

	public String getE_tel_no() {
		return e_tel_no;
	}

	public void setE_tel_no(String e_tel_no) {
		this.e_tel_no = e_tel_no;
	}

	public String getE_position() {
		return e_position;
	}

	public void setE_position(String e_position) {
		this.e_position = e_position;
	}

	public String getE_department() {
		return e_department;
	}

	public void setE_department(String e_department) {
		this.e_department = e_department;
	}
	
	@Override
	public String toString() {
		return "사원번호 : "+e_emp_no+", 사원명 : "+e_name;
	}
	
	
	
}
