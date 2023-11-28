package ddit.chap07.sec07;

public abstract class Unit {
	private int x;
	private int y;
	private String kind;

	public Unit() {
	}
	public Unit(int x, int y, String kind) {
		this.x = x;
		this.y = y;
		this.kind = kind;
	}

	public void stop(int x, int y, String kind) {
		this.x = x;
		this.y = y;
		this.kind = kind;
		System.out.println(kind + "유닛이 (" + x + "," + y + ") 위치로 이동 후 멈추었습니다.");
	}

	public String getkind() {
		return kind;
	}

	public abstract void move(int x, int y);

}