package ex03;

public class Shape {
	protected String name; // 도형 이름
	protected double area; // 도형 넓이
	
	public void printArea() {
		// 도형은 삼각형이며 넓이는 40.0cm^2 입니다.
		System.out.println("도형은 " + this.name + "이며 넓이는 " + this.area + "cm^2 입니다.");
	}
}
