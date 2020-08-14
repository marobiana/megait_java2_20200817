## 문제) 단위를 변환하는 추상클래스 만들기
> 주어진 추상클래스를 상속받아 달러->원, cm->inch로 변환하는 클래스를 작성하세요.  
* 1을 입력받으면 원을 달러로 변환(달러 입력), 2를 누르면 cm->inch로 변환(센티미터 입력)  
* 변환의 비율은 검색해서 생성자에 넣으세요.  
* 입출력 결과 화면  
  ![input/output example](https://github.com/marobiana/lecture/blob/features/test/Java2/06_abstract_quiz/input_ex.JPG?raw=true)  

### Converter.java (추상클래스)
```
public abstract class Converter {
	abstract protected void printConverted(); // 추상 메소드(필수 구현)
	protected double ratio; // 비율
	protected double result; // 결과
	
	public Converter(double ratio) {
		this.ratio = ratio;
	}
	
	public void convert(int input) {
		this.result = input * ratio;
	}
}
```  
