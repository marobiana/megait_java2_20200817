package ex01;

public class OmrCardTest {
	public static void main(String[] args) {
		OmrCard omrCard = new OmrCard();
		omrCard.setName("신보람");
		omrCard.setStudentId(1);
		omrCard.setAnswer(3, 4, 4, 1, 2);
		
		OmrCardReader omrCardReader = new OmrCardReader(3, 4, 4, 5, 1);
		omrCardReader.printScore(omrCard);
	}
}
