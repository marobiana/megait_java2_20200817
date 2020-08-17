package ex01;

public class Cellphone {
	// 속성: member 변수 또는 field - 명사로 짓기
  // 접근제한자: default, public, protected, private
	String maker = "apple";
	String model = "iPhone11pro";
	String color = "gold";
	int price = 183;
	
	// 기능: method - 동사로 짓기
	public void call() {
		System.out.println("여보세요");
	}
	
	public void camera() {
		System.out.println("찰칵");
	}
}
