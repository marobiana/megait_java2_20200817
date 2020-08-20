package ex01;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		//super.name = name;
		//super(name);
		this();
		this.name = name;
		this.major = major;
	}
	
	@Override
	public void introduce() {
		System.out.println("나의 전공은 " + this.major + "이다.");
		super.introduce();
	}
}
