## 문제) 기억력 게임
> 뒤집혀진 카드 중 두 개의 같은 모양 카드를 뒤집으면 성공, 모두 뒤집어야 게임이 끝난다.   
  
![예시](https://github.com/marobiana/megait_java2_20200817/blob/master/Java2/12_bonus_quiz/ex01/%EA%B8%B0%EC%96%B5%EB%A0%A5%EA%B2%8C%EC%9E%84.png)


 ### 게임 준비  
＊6개의 카드가 1차원 배열에 저장된다. (3개 쌍의 과일)  
예) ["사과", "사과", "바나나", "바나나", "수박", "수박"]    
＊6개의 카드를 섞는다. (0번째 index와 random한 index의 배열을 교체하는 형태로 50번 섞는다.)  
  
### 게임 시작  
＊뒤집을 카드 index 두 개를 입력받는다.(0~5)  
＊뒤집어진 카드 두 개의 번호를 출력한다.  
 예) [3]: 사과, [5]: 배  
＊두 개의 값이 같으면 "성공"이라고 출력하고, 두 index에 ""(빈 스트링)을 채워 표시한다.  
＊뒤집은 카드가 모두 빈칸이면 성공을 출력하지 않는다.  
＊모두 빈 스트링이 되면 게임을 끝낸다. (flag 필드가 true가 되면 게임 끝)  
  
### MemoryGameTest.java  
```
public static void main(String[] args) {
		MemoryGame memoryGame = new MemoryGame();
		memoryGame.shuffle(); // 카드 섞기
		
		Scanner scan = new Scanner(System.in);
		while (memoryGame.getFlag() == false) {
			System.out.println("뒤집을 카드의 index 두 개를 입력하세요.(0~5) 예) 3 5");
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();
			
			memoryGame.flip(index1, index2);
		}
		System.out.println("모두 맞추셨어요! 축하합니다!!!");
	}
```
