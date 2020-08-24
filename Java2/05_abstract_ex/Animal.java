package ex01;

// 추상클래스
//  1. 추상메소드가 하나라도 존재하는 클래스
//  2. 객체를 생성할 수 없다. 대신 해당클래스를 물려받은 자손만 객체화 할 수 있다.
public abstract class Animal {
	
	// 추상메소드
	//  자식 클래스가 반드시 구현해야 하는 메소드이다.
	public abstract void cry();
	
	// 일반메소드
	public void eat() {
		System.out.println("냠냠");
	}
}
