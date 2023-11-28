package ddit.chap06.sec04;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassanger;
	private static int numberOfPlanes; // 생산된 비행기 수 증가
	
	public Plane() {
		numberOfPlanes++;
	}
	
	public Plane(String manufacture, String model, int maxNumberOfPassanger) {
		//numberOfPlanes++;// this method로 없애기
		this(); //먼저 비행기수 증가하게 만들기
		this.manufacture=manufacture;
		this.model=model;
		this.maxNumberOfPassanger=maxNumberOfPassanger;
	}
	
	public void setManufacture(String manufacture) {
		this.manufacture=manufacture;
	}
	
	public String getManufacture() {
		return manufacture;
	}

	public void setModel(String model) {
		this.model=model;
	}
	
	public String getModel() {
		return model;
	}

	public void setmaxNumberOfPassanger(int maxNumberOfPassanger) {
		this.maxNumberOfPassanger=maxNumberOfPassanger;
	}
	
	public int getMaxNumberOfPassanger() {
		return maxNumberOfPassanger;
	}
	
	@Override
	public String toString() {
		return "제조사 : "+manufacture+"\n모델명 : "+model+"\n최대승객수 : "+maxNumberOfPassanger+"\n생산된 비행기 수 : "+numberOfPlanes+
				"\n----------------------------------------";
	}
	
	
	
}
