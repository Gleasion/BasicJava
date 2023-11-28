package ddit.chap06.sec01;

public class Employee {
	private String empId;
	String empName;
	String deptName;
	
	public Employee(String empId, String empName, String deptName) {
		this.empId=empId;
		this.empName=empName;
		this.deptName=deptName;
	}
		
	public void setDeptName(String newDept) {
		deptName=newDept;
	}
	
	public void getEmpInfo() {
		System.out.print("현재 "+empName+"("+empId+")"+"님의 부서는 "+deptName+"입니다.");
	}
	
}
