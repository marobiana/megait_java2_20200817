package constructor_quiz02;

public class TrumpCard {
	private String shape;
	private int number;
	
	public TrumpCard(String shape, int number) {
		this.shape = shape;
		this.number = number;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public int getNumber() {
		return this.number;
	}
}
