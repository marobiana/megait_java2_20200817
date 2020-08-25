package ex02;

public class Person {
	private String name;
	private int yyyymmdd;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setYyyymmdd(int yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}
	
	public int getYyyymmdd() {
		return this.yyyymmdd;
	}
	
	@Override
	public String toString() {
		// 이름: OOO, 생년월일: OOO
		String str = "이름: " + this.name + ", 생년월일: " + this.yyyymmdd;
		return str;
	}
}
