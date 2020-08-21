package ex04;

public class Person {
	private String name;
	private String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		// 이름: OOO, 성별: OOO
		return "이름: " + this.name + ", 성별:" + this.gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			
			if (this.name.equals(person.name) == false) {
				return false;
			}
			if (this.gender.equals(person.gender) == false) {
				return false;
			}
		} else {
			return false;
		}
		return true;	
	}
}
