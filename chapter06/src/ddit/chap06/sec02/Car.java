package ddit.chap06.sec02;

public class Car {
	private String company;
	private boolean gearType;
	
	void setCompany(String company) {
		this.company=company;
	}

	void setGearType(boolean gearType) {
		this.gearType=gearType;
		}
	
	void showInfo(){
		String str="";
		System.out.println("제조회사 : "+company);
		if(gearType) {
			str="자동";
		}else {
			str="수동";
		}
		System.out.println("기어형태 : "+str);
	}
	
	
}


