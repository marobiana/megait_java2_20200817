package ex01;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Animal animal = new Dog(); // dog -> animal : upcasting
		animal.eat();
		animal.cry();
	}
}
