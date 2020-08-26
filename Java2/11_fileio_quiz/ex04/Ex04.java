package ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex04/input.txt"); // �ü���� �ִ� ���� ��������(byte�� ������)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> ���ڷ� ��ȯ, �� ��° �Ķ���ʹ� ���� ���ڵ�(�ѱ� ����X)
		BufferedReader br = new BufferedReader(isr); // �� �پ� �о� ���̱� ����
		
		String readLine = br.readLine();
		Integer count = Integer.parseInt(readLine);
		for (int i = 0; i < count; i++) {
			String row = br.readLine();
			String[] str = row.split(" ");
			double num = Double.parseDouble(str[0]);
			for (int j = 1; j < str.length; j++) {
				if (str[j].equals("@")) {
					num *= 3;
				} else if (str[j].equals("%")) {
					num += 5;
				} else if (str[j].equals("#")) {
					num -= 7;
				}
			}
			System.out.println(Math.round(num * 100) / 100.0);
		}
	}

}
