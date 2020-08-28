package ex01;

public class Goods {
	private String name;
	private int price;
	private String state;
	
	public Goods() {
		
	}
	
	public Goods(String name, int price, String state) {
		this.name = name;
		this.price = price;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "물품명: " + this.name + " 가격: " + this.price + " 판매상태: " + this.state; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Goods) {
			Goods goodsObj = (Goods) obj;
			if (this.name.equals(goodsObj.name)) {
				return true;
			}
		} 
		return false;
	}
	
	
	// 물품명
	// 가격
	// 판매상태 (판매중, 판매완료, 예약중)
	
	// 멤버변수 접근 메소드 
}
