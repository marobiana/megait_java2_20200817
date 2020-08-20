## 문제) 비만도 계산하기
> 사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램
* 표준체중:SW=(H-100)*0.9
* 비만도: B(%)=(W-SW)/SW*100

* 1. 표준체중 계산하는 메소드를 정의한다. 
* 2. 비만도 여부를 구하는 메소드를 정의한다.  
(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
* 3. 출력결과  
박둘리님의 신장 160, 몸무게 45kg => 정상입니다.  
홍길동님의 신장 168, 몸무게 90kg => 비만입니다.

#### HeathInfo.java
```
public class HealthInfo {
	protected String name;
	protected int height;
	protected int weight;
	
	public HealthInfo() {
		// 기본 생성자 do nothing
	}
	
	public HealthInfo(String name, int height, int weight) {
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

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
}
```
