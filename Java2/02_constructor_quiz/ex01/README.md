## 문제) 로또 프로그램 만들기
> 1부터 45까지의 숫자 중 6개를 선택해서 로또를 발행하고, 당첨 결과를 확인하는 프로그램  
* 로또 클래스
* 1부터 45까지의 숫자를 수동으로 6개를 입력 받는다.(중복 불가)  
* 1부터 45까지의 숫자를 중복 없이 자동으로 입력 받는다.

* 로또 당첨 확인 클래스에서 1부터 45까지의 6개 수를 랜덤으로 당첨번호를 만든다.
* 로또 객체를 입력 받아서 로또 당첨 확인 클래스를 통해 당첨여부를 확인한다.

* 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝  

### LottoTest.java
```
public static void main(String[] args) {
		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();
		
		Lotto lotto1 = new Lotto();
		
		// 수동
		lotto1.manual(6, 10, 21, 23, 29, 44);
		String lottoResult1 = lottoChecker.check(lotto1);
		// 출력
		System.out.println(lottoResult1);
		
		Lotto lotto2 = new Lotto();
		// 자동
		lotto2.auto();
		String lottoResult2 = lottoChecker.check(lotto2);
		// 출력
		System.out.println(lottoResult2);
	}
```  
  
### 정답 보기
https://github.com/marobiana/lecture/blob/features/test/Java2/03_constructor_quiz/Lotto.java  
https://github.com/marobiana/lecture/blob/features/test/Java2/03_constructor_quiz/LottoChecker.java  
https://github.com/marobiana/lecture/blob/features/test/Java2/03_constructor_quiz/LottoTest.java
