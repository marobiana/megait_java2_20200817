package ex02;

import java.util.Random;

public class Lotto {
	private int[] numbers = new int[6];
	
	// 수동
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.numbers[0] = n1;
		this.numbers[1] = n2;
		this.numbers[2] = n3;
		this.numbers[3] = n4;
		this.numbers[4] = n5;
		this.numbers[5] = n6;
	}
	
	// 자동
	public void auto() {
		Random ran = new Random();
		//int rand = ran.nextInt(45) + 1; // 1~45
		this.numbers[0] = ran.nextInt(45) + 1; 
		this.numbers[1] = ran.nextInt(45) + 1; 
		this.numbers[2] = ran.nextInt(45) + 1; 
		this.numbers[3] = ran.nextInt(45) + 1; 
		this.numbers[4] = ran.nextInt(45) + 1; 
		this.numbers[5] = ran.nextInt(45) + 1; 
	}
	
	public void printLotto() {
		for (int i = 0; i < this.numbers.length; i++) {
			System.out.print(this.numbers[i] + " "); // 5 4 17 20 45 41
		}
	}
	
	public int[] getNumbers() {
		return this.numbers;
	}
	
}
