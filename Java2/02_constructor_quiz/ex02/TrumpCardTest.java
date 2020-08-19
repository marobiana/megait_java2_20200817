package constructor_quiz02;

import java.util.Random;

public class TrumpCardTest {

	public static void main(String[] args) {
		TrumpCard[] trumpCard = new TrumpCard[52];
		
		int trumpCardIdx = 0;
		// 스페이드
		for (int i = 1; i <= 13; i++) {
			TrumpCard spadeCard = new TrumpCard("spade", i);
			trumpCard[trumpCardIdx] = spadeCard;
			trumpCardIdx++;
		}

		// 하트
		for (int i = 1; i <= 13; i++) {
			TrumpCard heartCard = new TrumpCard("heart", i);
			trumpCard[trumpCardIdx] = heartCard;
			trumpCardIdx++;
		}

		// 다이아몬드
		for (int i = 1; i <= 13; i++) {
			TrumpCard diamondCard = new TrumpCard("diamond", i);
			trumpCard[trumpCardIdx] = diamondCard;
			trumpCardIdx++;
		}

		// 클로버
		for (int i = 1; i <= 13; i++) {
			TrumpCard clubCard = new TrumpCard("club", i);
			trumpCard[trumpCardIdx] = clubCard;
			trumpCardIdx++;
		}
		
		// 섞기 전 카드 순서
		printTrumpCard(trumpCard);
		
		// 카드 섞기
		shuffle(trumpCard);
		
		// 섞은 후 카드 순서
		printTrumpCard(trumpCard);
	}
	
	public static void printTrumpCard(TrumpCard[] trumpCard) {
		for (int i = 0; i < trumpCard.length; i++) {
			System.out.print(trumpCard[i].getShape() + "/" + trumpCard[i].getNumber() + ", ");
		}
		System.out.println("");
	}
	
	public static void shuffle(TrumpCard[] trumpCard) {
		Random rand = new Random();
		for (int i = 0; i < 1000; i++) {
			// 0과 나머지 51개의 랜덤한 자리 카드와 교환할 것이기 때문에, 0을 제외한 51개의 랜덤 수로 뽑는다.
			int swapIdx = rand.nextInt(51) + 1; // [1 ~ 52]
			// swap
			TrumpCard temp = trumpCard[0];
			trumpCard[0] = trumpCard[swapIdx];
			trumpCard[swapIdx] = temp;
		}
	}

}
