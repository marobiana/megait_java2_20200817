package ex01;

public class OmrCardReader {
	private int[] correctAnswer = new int[5];
	
	public OmrCardReader(int a1, int a2, int a3, int a4, int a5) {
		correctAnswer[0] = a1;
		correctAnswer[1] = a2;
		correctAnswer[2] = a3;
		correctAnswer[3] = a4;
		correctAnswer[4] = a5;
	}
	
	public void printScore(OmrCard omrCard) {
		String name = omrCard.getName();
		int studentId = omrCard.getStudentId();
		int answer[] = omrCard.getAnswer();
		
		System.out.println("이름: " + name);
		System.out.println("학번: " + studentId);
		int score = 0;
		for (int i = 0; i < this.correctAnswer.length; i++) {
			if (this.correctAnswer[i] == answer[i]) {
				score = score + 20;
			}
		}
		System.out.println("점수 :" + score);
	}
}
