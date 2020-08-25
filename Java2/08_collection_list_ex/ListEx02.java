package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		// 1. index 기반으로 출력하기 : loop를 돌리는 중간에 요소 삭제 하지 말 것
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			//System.out.println(element);
			
			// b로 시작하는 문자열 찾기
//			if (element.charAt(0) == 'b') {
//				System.out.println(element);
//			}
			
			if (element.startsWith("b")) {
				//System.out.println(element);
				//list.remove(i);
			}
		}
		
		// 2. 향상된 for문 
		for (String element : list) {
			if (element.startsWith("b")) {
				//System.out.println(element);
				//list.remove(element);
			}
		}
		//System.out.println(list);
		
		// 3. Iterator로 출력하기
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String element = iter.next();
			if (element.startsWith("b")) {
				iter.remove();
			}
		}
		System.out.println(list);
	}
}
