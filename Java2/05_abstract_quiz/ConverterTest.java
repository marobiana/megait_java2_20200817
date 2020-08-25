package ex02;

public class ConverterTest {
	public static void main(String[] args) {
		Converter d2w = new DollerToWon(1188); // 환율 검색하기
		Converter c2i = new CmToInch(); // 0.3
		
		d2w.convert(10000); // 10000 doller
		d2w.printConverted();
		
		c2i.convert(20); // 20cm
		c2i.printConverted();
	}

}
