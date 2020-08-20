package ex02;

public class LottoTest {

	public static void main(String[] args) {
		// LottoChecker 객체 생성 시 당첨번호가 생성된다.
		LottoChecker lottoChecker = new LottoChecker();
		lottoChecker.printWinningNumber();
		System.out.println(); // 줄바꿈
		
		Lotto lotto1 = new Lotto();
		
		// 수동
		lotto1.manual(6, 10, 21, 23, 29, 44);
		lotto1.printLotto();
		
		System.out.println(lottoChecker.check(lotto1)); // 로또 결과
	}

}
