package ex02;

public class HealthInfo {
	protected String name;
	protected float height;
	protected float weight;
	
	public HealthInfo() {
		// 기본 생성자 do nothing
	}
	
	public HealthInfo(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		// ex) 홍길동님의 신장 160, 몸무게 45kg 입니다.
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다.");
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}
}
