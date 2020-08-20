package ex02;

import java.util.Random;

public class LottoChecker {
	private int[] winningNumbers = new int[6];
	
	// 생성자에서 당첨번호를 랜덤으로 뽑아낸다.
	public LottoChecker() {
		Random ran = new Random();
		this.winningNumbers[0] = ran.nextInt(45) + 1; // 1~45
		this.winningNumbers[1] = ran.nextInt(45) + 1; // 1~45
		this.winningNumbers[2] = ran.nextInt(45) + 1; // 1~45
		this.winningNumbers[3] = ran.nextInt(45) + 1; // 1~45
		this.winningNumbers[4] = ran.nextInt(45) + 1; // 1~45
		this.winningNumbers[5] = ran.nextInt(45) + 1; // 1~45
	}
	
	public void printWinningNumber() {
		for (int i = 0; i < this.winningNumbers.length; i++) {
			System.out.print(this.winningNumbers[i] + " ");
		}
	}
	
	public String check(Lotto lotto){
		int[] numbers = lotto.getNumbers(); // 로또 번호
		
		int num = 0; // 몇 개가 맞았는지
		for (int i = 0; i < this.winningNumbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (winningNumbers[i] == numbers[j]) {
					num++;
					continue;
				}
			}
		}
		// 6개: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지: 꽝
		if (num == 6) {
			return "1등";
		} else if (num == 5) {
			return "2등";
		} else if (num == 4) {
			return "3등";
		} else if (num == 3) {
			return "4등";
		} else {
			return "꽝";
		}
	}

}
