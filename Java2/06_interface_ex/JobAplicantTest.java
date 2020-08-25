package ex03;

public class JobAplicantTest {
	public static void main(String[] args) {
		JobAplicant boram = new JobAplicant();
		System.out.println("자소서: " + boram.writeLetter());
		
		Naver naver = new Naver();
		naver.recuritJavaProgrammer(boram);
	}
}
