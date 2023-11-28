package ddit.chap06.sec01;

public class EmployeeEx {

	public static void main(String[] args) {
		//다음 기능을 수행하는 사원(Employee)클래스를 생성하시오.
		//속성 - 사원번호(String:empID), 사원명(String:empName), 부서명(String:deptName)
		//매서드 - 생성(생성자), 부서변경(setDeptName), 사원정보출력(getEmpInfo)
		//set:반환값x, get: 반환값ㅇ
		
		Employee em1=new Employee("A0001","홍길동","인사부");
				
		em1.setDeptName("경영부");
		em1.getEmpInfo();
		

	}

}
