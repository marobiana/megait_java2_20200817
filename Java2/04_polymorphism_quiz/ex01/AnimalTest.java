package ex02;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[2]; 
		animals[0] = new Cat(); // upcasting
		animals[1] = new Dog(); // upcasting
		
		for (int j = 0; j < animals.length; j++) {
			for (int i = 0; i < 3; i++) {
				animals[j].cry();
			}
		}
		
		// 다운 캐스팅
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Dog) {
				Dog dog = (Dog) animals[i];
				dog.lash();
			} else if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i];
				cat.grooming();
			}
		}
		
	}
}
