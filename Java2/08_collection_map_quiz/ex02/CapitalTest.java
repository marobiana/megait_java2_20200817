package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
	    {
	        put("대한민국", "서울");
	        put("덴마크", "코펜하겐");
	        put("독일", "베를린");
	        put("러시아", "모스크바");
	        put("벨기에", "브뤼셀");
	        put("브라질", "브라질리아");
	        put("스웨덴", "스톡홀름");
	        put("스위스", "베른");
	        put("스페인", "마드리드");
	        put("아르헨티나", "부에노스아이레스");
	        put("이집트", "카이로");
	        put("이란", "테헤란");
	        put("이탈리아", "로마");
	        put("일본", "도쿄");
	        put("필리핀", "마닐라");
	        put("핀란드", "헬싱키");
	        put("프랑스", "파리");
	        put("터키", "앙카라");
	        put("캐나다", "오타와");
	        put("콜롬비아", "보고타");
	    }
	};
	
	public static void main(String[] args) {
		Set<String> keys = capitalMap.keySet();
		List<String> keyList = new ArrayList<>(keys);
		
		int score = 0;
		List<Integer> randIndex = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Random rand = new Random();
			int index = rand.nextInt(20); // 0~19
			
			// 중복 체크
			if (randIndex.contains(index)) {
				// 중복
				i--;
				continue;
			}
			randIndex.add(index);
			
			String key = keyList.get(index); // 나라이름
			System.out.println(keyList.get(index) + "의 수도는? ");
			
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine(); // 사용자가 입력한 답
			String capital = capitalMap.get(key); // 수도 (정답)
			if (answer.equals(capital)) {
				System.out.println("정답");
				score += 20;
			} else {
				System.out.println("오답");
			}
			
		}
		
		// 1. 문제 개수만큼 loop 돌기
		// 2. 랜덤으로 keyList의 index랜덤 수를 뽑는다.
		// 3. 2번에서 구한 랜덤 index를 가지고 keyList에서 뽑아서 문제를 낸다.(println)
		// 4. scanner로 사용자가 답을 입력한다.
		// 5. 맵에 들어있는 key-value와 4번에서 입력받은 값과 비교
		 	// 맞는지 여부를 println로 출력한다.
		// 6. 점수를 구한다.
	}
}
