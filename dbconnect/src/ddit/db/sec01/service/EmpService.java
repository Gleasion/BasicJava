package ddit.db.sec01.service;

import ddit.db.sec01.dao.EmployeeDao;
import ddit.db.sec01.vo.EmployeeVO;

public class EmpService { //사용자가 원하는 로직을 구현한 클래스
	// dao랑 차이점은 여러테이블 가능
	// dao에서 넘겨준 자료를 service에서 한번에 묶어 처리
	// 한개의 테이블에는 Service가 없어도 되지만,
	// 여러개의 테이블이 있을 경우에는 service 필요함
	private static EmpService instance = null;
	private EmpService() {}
	public static EmpService getInstance() {
		if(instance==null) instance = new EmpService();
			return instance;
		}
	
	public EmployeeVO login(String emp_no) {
		EmployeeVO empVO = EmployeeDao.getInstance().selectOne(emp_no);
		if(emp_no.equals(empVO.getE_emp_no())){
			return empVO;
		}
		return null;
	}

	public boolean register(EmployeeVO empVO) {
		int res = EmployeeDao.getInstance().insert(empVO);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean changeEmpInfo(EmployeeVO empVO) {
		int res = EmployeeDao.getInstance().modify(empVO.getE_emp_no(), empVO);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteEmployee(String e_emp_no) {
		int res = EmployeeDao.getInstance().delete(e_emp_no);
		if(res>0) {
			return true;
		}else {
			return false;
		}
	}
}
