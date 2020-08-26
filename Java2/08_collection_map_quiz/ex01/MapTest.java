package ex06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("유재석", "X");
		map.put("박나래", "X");
		map.put("이지은", "X");
		map.put("서장훈", "X");
		map.put("이광수", "X");
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			if (name.startsWith("이")) {
				map.put(name, "O");
			}
		}
		
		System.out.println("결과: " + map);
	}

}
