package quiz04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz04 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex04/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
		BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
		
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
