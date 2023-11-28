package ddit.chap07.sec01;

public class Student extends People { // 부모(People)-자식(Student)클래스 생성
	int stdID;
	
	public Student(){} // People(); 이거를 불러야함
	
	public Student(String name, String gender, int stdID) {
		super(name, gender);// name과 gender를 여기서 호출
		this.stdID=stdID;
	}
}
