package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SearchTest {

	public static void main(String[] args) {
		// [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
		List<Map<String, String>> characters = new ArrayList<>();

		//Map<String, String> myCharacter = new HashMap<>();
		//myCharacter.put("닉네임", "마로비아나");
		//myCharacter.put("직업", "마법사");
		//myCharacter.put("서버", "B");
		//myCharacter.put("레벨", "38");
		//characters.add(myCharacter);

		Map<String, String> character1 = new HashMap<>();
		character1.put("닉네임", "사자고양이");
		character1.put("직업", "전사");
		character1.put("서버", "A");
		character1.put("레벨", "11");
		characters.add(character1);

		Map<String, String> character2 = new HashMap<>();
		character2.put("닉네임", "하구루");
		character2.put("직업", "마법사");
		character2.put("서버", "B");
		character2.put("레벨", "46");
		characters.add(character2);

		Map<String, String> character3 = new HashMap<>();
		character3.put("닉네임", "바다");
		character3.put("직업", "힐러");
		character3.put("서버", "B");
		character3.put("레벨", "23");
		characters.add(character3);

		Map<String, String> character4 = new HashMap<>();
		character4.put("닉네임", "초보");
		character4.put("직업", "힐러");
		character4.put("서버", "A");
		character4.put("레벨", "4");
		characters.add(character4);

		Map<String, String> character5 = new HashMap<>();
		character5.put("닉네임", "린다G");
		character5.put("직업", "힐러");
		character5.put("서버", "B");
		character5.put("레벨", "84");
		characters.add(character5);

		Iterator<Map<String, String>> iter = characters.iterator();
		Map<String, String> result = null; // 레벨이 높은 사람
		while (iter.hasNext()) {
			Map<String, String> map = iter.next();
			String job = map.get("직업"); // 값 (직업)
			String server = map.get("서버"); // 값 (서버)
			
			if (job.equals("힐러") && server.equals("B")) {
				if (result == null) {
					result = map;
				} else {
					String nextLevel = map.get("레벨"); // next 번째
					String level = result.get("레벨"); // 아까 저장한 map
					if (nextLevel.compareTo(level) > 0) {
						result = map;
					}
					
//					String levelStr = result.get("레벨");
//					Integer level = Integer.parseInt(levelStr); // String -> Integer
//					String nextLevelStr = map.get("레벨");
//					Integer nextLevel = Integer.parseInt(nextLevelStr);
//					if (level < nextLevel) {
//						result = map;
//					}
				}
			}
		}
		
		System.out.println(result);
	}
}
