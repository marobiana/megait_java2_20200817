package ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex05/input.txt"); // �ü���� �ִ� ���� ��������(byte�� ������)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> ���ڷ� ��ȯ, �� ��° �Ķ���ʹ� ���� ���ڵ�(�ѱ� ����X)
		BufferedReader br = new BufferedReader(isr); // �� �پ� �о� ���̱� ����
		
		String readLine = br.readLine();
		String str = br.readLine();
		String[] strArr = str.split(" ");
		
		int y = 0;
		int m = 0;
		for (int i = 0; i < strArr.length; i++) {
			Integer callTime = Integer.parseInt(strArr[i]);
			
			y += yungsik(callTime);
			m += minsik(callTime);
		}
		
		if (y < m) {
			System.out.println("Y " + y);
		} else if (y == m) {
			System.out.println("Y M " + y);
		} else {
			System.out.println("M " + m);
		}
	}
	
	public static int yungsik(Integer callTime) {
		return ((callTime / 30) + 1) * 10; // callTime / 30�� �����̴�. 0������ 10���� �Ǿ�� �ϹǷ� 1�� ������. 1�������� ����
	}
	
	public static int minsik(Integer callTime) {
		return ((callTime / 60) + 1) * 15;
	}

}
