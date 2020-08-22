```
    		int a = 0;
		int b = 0; // 1. 숫자두개(됨), 2. String으로 변경(안됨), 3. 둘 다 스트링으로 변경(됨)
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		scan.nextLine();
		b = scan.nextInt();
		System.out.println(a + b);

```


## 문제) List 입력, 출력, 삭제 하기  
  
> List<Person> 입력, 출력, 삭제 하기  
  
＊Person 클래스 멤버변수  
   1. 이름(String)  
   2. 생년월일(int)  
  
＊1:입력 2:출력 3:삭제 4:종료  
＊무한루프를 돌고, 4번을 누르면 입력 종료  
  
＊1:입력: 입력받은 이름과 생년월일을 입력받아서 Person객체를 생성하고 List에 넣는다.  
  
＊2.출력: Person객체가 있으면 출력하고, 아무것도 없을 경우 "비어있습니다." 라고 출력한다.  
  
＊3.삭제: "삭제할 사람 이름을 입력하세요: "를 출력하고 이름이 일치하는 Person 객체를 삭제한다.(Iterator 사용)  
  
＊ 4.종료: "종료합니다."를 출력한 후 프로그램을 종료시킨다.  
＊1~4 이외의 값을 입력받으면 "잘못 입력했습니다" 출력한다.  