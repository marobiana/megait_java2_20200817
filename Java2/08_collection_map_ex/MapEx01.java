package ex05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx01 {
	// Map
	//  1. key-value 쌍으로 이루어져 있다.
	//  2. key는 중복되지 않지만, value은 중복이 가능하다.(ex: 주민번호-이름)
	//  3. key를 통해서 value를 아주 빠르게 찾을 수 있다.
	//  4. value로는 key를 찾기 어렵다.
	
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println("map1 : " + map1.toString());
		
		System.out.println("key에 c가 있나? " + map1.containsKey("c"));
		System.out.println("value에 5가 있나? " + map1.containsValue(5));
		System.out.println("map의 size: " + map1.size());
		
		Set<String> keys = map1.keySet();
		System.out.println("keys: " + keys);
		
		Collection<Integer> values = map1.values();
		System.out.println("values: " + values);
		
		map1.remove("c");
		System.out.println("remove c map1: " + map1);
		map1.remove("d", 4);
		System.out.println("remove d map1: " + map1);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println("map2 + map1: " + map2);
	}
}
