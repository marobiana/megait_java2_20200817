package ex02;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		Person boram = new Person(19971108, "여자", "신보람");
		boram.introduce();
		Person boram1 = new Person(19981108, "여자");
		boram1.introduce();
		boram1.setName("신보람");
		boram1.introduce();
	}

}
