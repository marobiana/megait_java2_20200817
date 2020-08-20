## 문제) 다형성과 업캐스팅, 다운캐스팅 사용해보기  
> Animal 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해서 출력해보세요.  
  
고양이와 개가 있다.  
고양이와 개가 각각 3번씩 울음소리를 냈다.  
그러고 나서 고양이는 그루밍을 했다.  
개는 꼬리를 흔들었다.  
  
### AnimalTest.java  
```
public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Dog();
		
		// TODO: 구현하기
	}
```

**결과**  
```
야옹  
야옹  
야옹  
멍멍  
멍멍  
멍멍  
핥짝핥짝 그루밍  
꼬리 흔들흔들  
```