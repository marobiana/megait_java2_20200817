package ex06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex06/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
		BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
		
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
