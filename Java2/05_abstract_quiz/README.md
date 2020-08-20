## 문제) 단위를 변환하는 추상클래스 만들기
> Converter 달러->원, cm->inch로 변환하는 클래스를 작성하세요.  

문제 설명: 달러 원, 센치 -> 인치바꾸는 컨버터를 만들거다
1달러는 1200 3달러는 3600원   1센치는 0.3 , 3센치 0.9인치 이런식으로 입력받으면 변환을 해주는 클래스를 추상클래스
환율은 1200을 곱하고 인치는 비율을 곱하는거라 공식이 같기때문에 부모에 만들었다

결과를 출력하는 단위와 형태가 다르기때문에 추상메소드로 만들어서 자식에게 강제 구현을 시킨다.

### Converter.java (추상클래스)
```
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
```  

### ConverterTest.java
```
public static void main(String[] args) {
		Converter d2w = new DollerToWon(1188); // 환율 검색하기
		Converter c2i = new CmToInch();
		
		d2w.convert(10000);
		d2w.printConverted();
		
		c2i.convert(20);
		c2i.printConverted();
	}
```

### 출력 결과
```
1.188E7원
7.874020000000001inch
```
