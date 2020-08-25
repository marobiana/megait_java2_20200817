## 문제) 파티원 구하기  
> 필요한 파티원의 정보를 출력하세요.  
> 탐색 시 Iterator를 사용하세요.

＊n명의 게임 캐릭터 정보가 주어진다.  
＊필요한 파티원 조건: 
   - 힐러
   - myCharacter와 같은 서버 멤버 후보를 모두 출력한다.

+ 보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.

```
	public static void main(String[] args) {
		// [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
		List<Map<String, String>> charaters = new ArrayList<>();
		
		Map<String, String> myCharacter = new HashMap<>();
		myCharacter.put("닉네임", "마로비아나");
		myCharacter.put("직업", "마법사");
		myCharacter.put("서버", "B");
		myCharacter.put("레벨", "38");
		charaters.add(myCharacter);
		
		Map<String, String> character1 = new HashMap<>();
		character1.put("닉네임", "사자고양이");
		character1.put("직업", "전사");
		character1.put("서버", "A");
		character1.put("레벨", "11");
		charaters.add(character1);
		
		Map<String, String> character2 = new HashMap<>();
		character2.put("닉네임", "하구루");
		character2.put("직업", "마법사");
		character2.put("서버", "B");
		character2.put("레벨", "46");
		charaters.add(character2);

		Map<String, String> character3 = new HashMap<>();
		character3.put("닉네임", "바다");
		character3.put("직업", "힐러");
		character3.put("서버", "B");
		character3.put("레벨", "23");
		charaters.add(character3);
		
		Map<String, String> character4 = new HashMap<>();
		character4.put("닉네임", "초보");
		character4.put("직업", "힐러");
		character4.put("서버", "A");
		character4.put("레벨", "4");
		charaters.add(character4);
		
		Map<String, String> character5 = new HashMap<>();
		character5.put("닉네임", "린다G");
		character5.put("직업", "힐러");
		character5.put("서버", "B");
		character5.put("레벨", "84");
		charaters.add(character5);
		
		// TODO: 구현
	}
```
