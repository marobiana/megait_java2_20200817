## 문제) 집합 구하기 
> 1234, 3456 의 교집합, 차집합, 합집합을 구하세요.

### SetTest.java
```
public static void main(String[] args) {
		// Q. 1234, 3456 의 교집합, 차집합, 합집합을 구하세요.

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Set<Integer> intersection = new HashSet<>(); // 교집합: 3, 4
		Set<Integer> difference = new HashSet<>(); // 차집합: set1 - set2 => 1, 2
		Set<Integer> union = new HashSet<>(); // 합집합: 1, 2, 3, 4, 5, 6

		// TODO..
}
```  


