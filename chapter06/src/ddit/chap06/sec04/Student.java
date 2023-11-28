package ddit.chap06.sec04;

public class Student {
	
	private long stdId;
	private String name;
	private String telNo;
	
	public Student() {}
	
	public Student(long stdId, String name, String telNo) {
		this.stdId=stdId;
		this.name=name;
		this.telNo=telNo;
		
	}
	
	public void setTelNo(String telNo) {
		this.telNo=telNo;
	}
	
	@Override //annotation 어노테이션 - 컴파일 되어지는 주석
	public String toString() { //print에서 사용함
		return "학번 : "+stdId+"\n이름 "+name+"\n전화번호 : "+telNo+
				//객체참조변수가 사용되어진 곳에만 사용
			   "\n---------------------------------";
	}
	
}
