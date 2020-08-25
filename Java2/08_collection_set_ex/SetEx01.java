package ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// Set 
		//  1. 중복이 되지 않는다.
		//  2. index 기반이 아니다.
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		boolean isSuccess = set1.add(1);
		System.out.println(isSuccess);
		System.out.println("set1: " + set1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println("set2: " + set2);
		
		System.out.println("set2에 10이 있는가? " + set2.contains(10));
		System.out.println("set2에 100이 있는가? " + set2.contains(100));
		
		set2.removeAll(set1); 
		System.out.println("set2 - set1 한 차집합 결과: " + set2);
		
		// TreeSet
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println("set3: " + set3);
		
		// 출력하기
		
		Iterator<String> iter = set3.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println("element: " + element);
		}
		
		// 향상된 for문
		for (Integer element : set1) {
			System.out.println("element: " + element);
		}
		
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(10);
//		list1.add(11);
//		Set<Integer> set2 = new HashSet<>(Arrays.asList(100, 101, 102));
//		System.out.println("set2: " + set2);
		
	}
}
