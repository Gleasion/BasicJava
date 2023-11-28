package ddit.db.sec01;

import java.util.Scanner;

import ddit.db.sec01.vo.EmployeeVO;
import ddit.db.sec01.service.EmpService;

public class EmpMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		init();
	}

	public static void init() {
		System.out.println("**** 메   뉴 ****");
		System.out.println(" [0]. 로그인");
		System.out.println(" [1]. 사원등록");
		System.out.println(" [2]. 사원 정보 변경");
		System.out.println(" [3]. 사원삭제");
		System.out.println(" [9]. 종료");
		System.out.println("------------------------");
		System.out.print("작업번호 선택 : ");
		int choice = sc.nextInt();

		while (true) {
			switch (choice) {
			case 0:
				logIn();
				break;
			case 1:
				insertEmp(); // db에 insert함
				break;
			case 2:
				// updateEmp();
				// break;
			case 3:
				// deleteEmp();
				// break;
			case 9:
				System.exit(0);
			}
		}
	}

	public static void insertEmp() {
		EmployeeVO empVO = new EmployeeVO(); // 그냥 생성자 생성
		EmpService service = EmpService.getInstance();

		System.out.println("등록할 사원 정보를 입력하세요...");

		System.out.print("사원번호 : ");
		empVO.setE_emp_no(sc.next());

		System.out.print("사원이름 : ");
		empVO.setE_name(sc.next());
		sc.nextLine();
		
		System.out.print("주소 : ");
		empVO.setE_address(sc.nextLine());

		System.out.print("전화번호 : ");
		empVO.setE_tel_no(sc.next());

		System.out.print("직위 : ");
		empVO.setE_position(sc.next());

		System.out.print("부서명 : ");
		empVO.setE_department(sc.next());

		if (service.register(empVO)) { // service 클래스를 부름
			System.out.println("자료가 정상적으로 저장되었습니다...");
		}
	}

//	public static void update() {
//
//	}
//
//	public static void deleteEmp() {
//
//	}
	
	public static void logIn() {
		EmpService service = EmpService.getInstance();
		System.out.print("로그인할 사원번호 : ");
		String emp_no = sc.next();
		EmployeeVO empVO = service.login(emp_no);

		System.out.println(empVO.getE_name() + "님이 로그인 했습니다...");
	}

}
