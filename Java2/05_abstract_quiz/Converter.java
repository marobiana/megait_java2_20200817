package ex02;

public abstract class Converter {
	abstract protected void printConverted(); // 추상 메소드(필수 구현)
	protected double ratio; // 비율(환율 또는 1cm의 inch값)
	protected double result; // 결과
	
	public Converter() {
		// do nothing
	}
	
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
	public void convert(int input) {
		this.result = input * ratio;
	}
}
