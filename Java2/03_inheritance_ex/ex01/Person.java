package ex01;

public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~");
	}
	
	// 생성자 오버로딩
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		// 제 이름은 OO입니다.
		System.out.println("제 이름은 " + this.name + "입니다.");
	}
}
