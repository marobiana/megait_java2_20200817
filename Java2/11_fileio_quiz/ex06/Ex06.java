package ex06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex06/input.txt"); // �ü���� �ִ� ���� ��������(byte�� ������)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> ���ڷ� ��ȯ, �� ��° �Ķ���ʹ� ���� ���ڵ�(�ѱ� ����X)
		BufferedReader br = new BufferedReader(isr); // �� �پ� �о� ���̱� ����
		
		String readLine = br.readLine();
		String[] strArr = readLine.split(" ");
		int[] arr = new int[3];
		int prizeMoney = 0;
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		if (arr[0] == arr[1] && arr[0] == arr[2]) {
			prizeMoney = 10000 + arr[0] * 1000;
		} else {
			if (arr[0] == arr[1] || arr[0] == arr[2]) {
				prizeMoney = 1000 + arr[0] * 100;
			} else if (arr[1] == arr[2]) {
				prizeMoney = 1000 + arr[1] * 100;
			} else {
				int max = arr[0];
				if (max < arr[1]) {
					max = arr[1];
				} else if (max < arr[2]) {
					max = arr[2];
				}
				prizeMoney = max * 100;
			}
		}
		
		System.out.println(prizeMoney);
	}

}
