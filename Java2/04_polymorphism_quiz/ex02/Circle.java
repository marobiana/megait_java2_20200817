package ex03;

public class Circle extends Shape {
	public Circle(int r) {
		this.name = "원";
		this.area = r * r * Math.PI;
	}
}
