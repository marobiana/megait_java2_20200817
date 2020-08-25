package ex03;

public class JobAplicant implements CProgramming, JavaProgramming {
	private int toeic;
	private double grade; // 학점
	private String[] license; // 자격증
	
	public String writeLetter() {
		String letter = "저는 서울에서 태어나 인자하신 부모님...";
		return letter;
	}

	public void procedure() {
		System.out.println("나는 절차지향 어쩌구저쩌구, c에는 변수가 있고, 함수가 있고, 반복문....");
	}

	public void objectOriented() {
		System.out.println("나는 객체지향을 어떻게 알고 있다~~");
	}
	
	// getter, setters...
}
