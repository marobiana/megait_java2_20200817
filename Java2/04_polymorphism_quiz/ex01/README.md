## 문제) 다형성을 이용해서 도형의 넓이 구하기
> 삼각형, 사각형, 원의 넓이를 구하고 출력한다.

### ShapeTest.java
```
public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		
		// upcasting
		shape[0] = new Triangle(8, 10);
		shape[1] = new Rectangle(7, 13);
		shape[2] = new Circle(12);

		for (int i = 0; i < shape.length; i++) {
			shape[i].printArea();
		}
	}
```
**결과**
```
도형은 삼각형이며 넓이는 40.0cm^2 입니다.  
도형은 사각형이며 넓이는 91.0cm^2 입니다.  
도형은 원이며 넓이는 452.38934cm^2 입니다.  
```
