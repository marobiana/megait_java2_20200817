package ex02;

public class HealthRate extends HealthInfo {
	public HealthRate(String name, float height, float weight) {
		//super(name, height, weight);
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public float standardWeight() {
		// 표준체중: SW=(H-100)*0.9
		return (float) ((super.height -100) * 0.9);
	}
	
	public String getRateObesity() {
		// 비만도: B(%)=(W-SW)/SW*100
		// 비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만
		float sw = standardWeight();
		float rate = (this.weight - sw) / sw * 100;
		
		//String result = null;
		if (rate < 10) {
			return "정상";
		} else if (rate >= 10 && rate < 20) {
			return "과체중";
		}
		return "비만";
	}
	
	@Override
	public void showInfo() {
		// 예) 박둘리님의 신장 160, 몸무게 45kg => 정상입니다.
		System.out.println(this.name + "님의 신장 " + this.height + ", 몸무게 "
				+ this.weight + "kg => " + getRateObesity() + "입니다.");
	}
}
