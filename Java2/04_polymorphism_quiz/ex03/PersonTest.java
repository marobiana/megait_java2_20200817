package ex04;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("신보람", "여자");
		System.out.println("toString: " + person.toString());
		
		Person person2 = new Person("신보람", "여자");
		System.out.println(person.equals(person2));
	}

}
