package ex02;

public class DollerToWon extends Converter {
	public DollerToWon(double ratio) {
		this.ratio = ratio;
	}

	protected void printConverted() {
		System.out.println((int) this.result + "원");
	}
}
