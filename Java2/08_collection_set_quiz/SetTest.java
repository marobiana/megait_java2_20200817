package ex04;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// Q. 1234, 3456 의 교집합, 차집합, 합집합을 구하세요.

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		Set<Integer> intersection = new HashSet<>(); // 교집합: 3, 4
		Set<Integer> difference = new HashSet<>(); // 차집합: set1 - set2 => 1, 2
		Set<Integer> union = new HashSet<>(); // 합집합: 1, 2, 3, 4, 5, 6

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		intersection.addAll(set1);
		difference.addAll(set1);
		union.addAll(set1);
		
		// 교집합
		intersection.retainAll(set2);
		System.out.println("교집합: " + intersection);
		
		// 차집합
		difference.removeAll(set2);
		System.out.println("차집합 set1 - set: " + difference);
		
		// 합집합
		union.addAll(set2);
		System.out.println("합집합 set1 + set2: " + union);
	}
}
