package ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열(Array)
		//  1. 크기를 미리 알고 있어야 한다. 크기가 고정되어 있다.
		//  2. 중간에 있는 값을 빼내면 비어있는 채로 유지된다.
		//  3. index 기반으로 접근이 가능하다.
		//  4. 기본자료형(primitive type), 객체도 담을 수 있다.
		
		// List
		//  1. 크기가 고정되어 있지 않고, 동적으로 할당된다.
		//  2. 중간에 있는 값을 빼내면 앞으로 당겨진다. (메모리 낭비가 없다)
		//  3. 여러 방법으로 데이터를 다룰 수 있다.
		//  4. 객체만 담을 수 있다.(기본자료형 저장 안됨)
		//  5. 타입 안정성을 보장하는 generic을 쓸 수 있다.
		
		List<Integer> list1 = new ArrayList<Integer>(); // generic
		list1.add(1);
		list1.add(2);
		boolean isSuccess = list1.add(3);
		System.out.println("isSuccess: " + isSuccess);
		System.out.println("list1" + list1);
		System.out.println("list1 toString(): " + list1.toString());
		
		List<Integer> list2 = new LinkedList<Integer>();
		list2.addAll(list1); // list1에 있는 내용을 list2에 담는다.
		System.out.println("list2: " + list2);
		
		System.out.println("list2에 숫자1이 들어있는가? " + list2.contains(1));
		System.out.println("list2에 숫자7이 들어있는가? " + list2.contains(7));
		
		// 교집합 구하기
		list2.remove(2);
		list2.add(8);
		list2.add(9);
		System.out.println("list2 " + list2);
		
		list2.retainAll(list1);
		System.out.println("list2 " + list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(82);
		list3.add(7);
		list3.add(46);
		
		list3.sort(Comparator.naturalOrder()); // naturalOrder: 오름차순
		System.out.println("오름차순 list3: " + list3);
		list3.sort(Comparator.reverseOrder()); // reverseOrder: 내림차순
		System.out.println("내림차순 list3: " + list3);
		
		
//		List<String> list2 = new LinkedList<String>();
//		list2.add("a");
//		list2.add("b");
//		list2.add("c");
//		System.out.println("list2: " + list2);
//		list2.remove(1);
//		System.out.println("index로 삭제한 후 list2: " + list2);
//		list2.add(1, "z");
//		System.out.println("index 1번째에 추가한 후 list2: " + list2);
//		
//		list2.clear(); // 모든 요소 삭제
//		System.out.println("list2: " + list2); // []
//		
//		System.out.println("list2가 비어있는가? " + list2.isEmpty());
		
//		list2.remove("a");
//		System.out.println("값으로 삭제한 후 list2: " + list2);
	}
}
