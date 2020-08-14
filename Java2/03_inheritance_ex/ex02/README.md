## 문제) 비만도 계산하기
> 사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램
* 표준체중:SW=(H-100)*0.9
* 비만도: B(%)=(W-SW)/SW*100

* 1. 표준체중 계산하는 메소드를 정의한다. 
* 2. 비만도 여부를 구하는 메소드를 정의한다.  
(비만도가 10% 미만이면 정상, 10%이상 20% 미만이면 과체중, 20% 이상은 비만)
* 3. 출력결과  
박둘리님의 신장 160, 몸무게 45kg => 정상입니다.  
홍길동님의 신장 168, 몸무게 90kg => 비만입니다.
  
### 정답 보기
https://github.com/marobiana/lecture/blob/features/test/Java2/04_inheritance_ex/ex02/HealthInfo.java
https://github.com/marobiana/lecture/blob/features/test/Java2/04_inheritance_ex/ex02/HealthRate.java
https://github.com/marobiana/lecture/blob/features/test/Java2/04_inheritance_ex/ex02/HealthTest.java
