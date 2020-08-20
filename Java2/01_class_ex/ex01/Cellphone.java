package ex01;

public class Cellphone {
	// 멤버변수 접근제한자: default, public, protected, private
	// 클래스 접근제한: default, public
	
	// 1.요소: 멤버변수, 필드(field)
	private String maker = "apple";
	private String model = "iphone11pro";
	private String color = "gold";
	
	// getter
	public String getMaker() {
		return this.maker;
	}
	
	// setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	// 2. 기능: method
	void call() {
		System.out.println("여보세요");
	}
	
	public void camera() {
		System.out.println("찰칵");
	}
	
}
