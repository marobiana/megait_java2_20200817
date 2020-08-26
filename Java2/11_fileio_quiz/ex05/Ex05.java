package ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex05/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
		BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
		
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
		return ((callTime / 30) + 1) * 10; // callTime / 30이 구간이다. 0구간에 10원이 되어야 하므로 1을 더해줌. 1구간으로 땡김
	}
	
	public static int minsik(Integer callTime) {
		return ((callTime / 60) + 1) * 15;
	}

}
