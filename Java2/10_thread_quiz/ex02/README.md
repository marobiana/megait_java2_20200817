## 문제) 스톱와치(Stopwatch)  
> '시작'을 입력 받으면 스톱와치가 시작되고, '그만'을 입력받으면 스톱와치가 종료되며 걸린 시간(초)를 출력하는 프로그램  
* Thread를 상속받아 사용하세요.
* '시작', '그만'은 메인쓰레드에서 입력 받는다.
* 스톱와치 시간 측정은 Stopwatch 쓰레드에서 무한루프를 돌며 계산한다.
* stop() 메소드가 deprecated 되었기 때문에 아래 코드와 같이 flag를 사용하는 코드로 작성해야 한다.  
  Thread를 상속받은 자식클래스에서 boolean stop; 플래그를 만들고,  
  run 메소드에서 stop이 false가 될 때까지 돌도록 해야한다.  
  setStop으로 종료 시점을 입력 받는다.  
```
class Stopwatch extends Thread {
    private boolean stop; // stop flag

    @Override
    public void run() {
        while (!stop) {
            // 무한 실행
        }
        // 실행 종료
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
```
