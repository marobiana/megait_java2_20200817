package ex01;

public class OmrCard {
	private int studentId;
	private String name;
	private int[] answer = new int[5];
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public int[] getAnswer() {
		return this.answer;
	}
	public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5) {
		this.answer[0] = answer1;
		this.answer[1] = answer2;
		this.answer[2] = answer3;
		this.answer[3] = answer4;
		this.answer[4] = answer5;
	}

}
