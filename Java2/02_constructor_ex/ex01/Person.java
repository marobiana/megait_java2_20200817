package ex02;

public class Person {
	// 멤버변수, 필드
	private int yyyymmdd; // 생년월일
	private String gender; // 성별
	private String name; // 이름
	
	// 생성자(Constructor): default 생성자
	//  리턴타입 없다. 
	//  클래스명과 같다. 
	//  객체가 생성되는 시점에 불려진다.
	public Person() {
		System.out.println("응애응애");
	}
	
	public Person(int yyyymmdd, String gender) {
		this();
		this.yyyymmdd = yyyymmdd;
		this.gender = gender;
	}
	
	// 생성자 오버로딩(Overloading): 이름이 같은 메소드인데, 파라미터가 다르다.
	public Person(int yyyymmdd, String gender, String name) {
		this(); // 기본생성자 호출
		this.yyyymmdd = yyyymmdd;
		this.gender = gender;
		this.name = name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 기능
	public void eat() {
		System.out.println("냠냠");
	}
	
	public void sleep() {
		System.out.println("쿨쿨 zZZ");
	}
	
	public void walk() {
		System.out.println("터벅터벅");
	}
	
	public void introduce() {
		// 제이름은 oo이고 '제 나이는 OO세이고' 성별은 oo입니다.
		System.out.println("제 이름은 " + this.name + "이고 "
				+ "제 나이는 " + getAge() + "이고 성별은 " 
				+ this.gender + "입니다.");
	}
	
	private int getAge() {
		int year = this.yyyymmdd / 10000;
		int age = (2020 - year) + 1;
		return age;
	}	
}
