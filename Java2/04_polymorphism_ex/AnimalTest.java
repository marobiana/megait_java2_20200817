package ex01;

public class AnimalTest {
	public static void main(String[] args) {
		// 업캐스팅:
		//   1. 부모클래스에 있는 메소드를 사용할 수 있다.
		//   2. 부모클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
		//   3. 자식클래스에 있는 메소드는 사용할 수 없다.
		Animal animal = (Animal) new Cat(); // upcasting: 자식 -> 부모 캐스팅
		animal.eat();
		animal.cry();
		
		// 부모클래스 -> 자식클래스 다운캐스팅은 캐스팅을 명시로 해주어야 된다.
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.lash();
		} else if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.grooming();
		}

// 캐스팅 예제
//		int n = 3;
//		double d = n;
//		System.out.println(d);
		
//		double d = 3.9;
//		int n = (int)d;
//		System.out.println(n);
	}
}
