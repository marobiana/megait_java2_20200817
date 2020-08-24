package ex02;

public class CmToInch extends Converter {
	public CmToInch() {
		this.ratio = 0.393701;
	}

	protected void printConverted() {
		System.out.println(Math.round(this.result * 1000) / 1000.0 + "inch");
		//System.out.println(this.result + "inch");
	}
}
