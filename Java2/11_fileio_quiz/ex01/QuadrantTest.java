package quiz01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/FileIO_quiz_ex01/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
			BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
			
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				readLine = br.readLine();
				String[] strArr = readLine.split(" "); // ["12", "5"]
				Integer x = Integer.parseInt(strArr[0]);
				Integer y = Integer.parseInt(strArr[1]);
				
				printQuadrant(x, y);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printQuadrant(int x, int y) {
		if (x < 0) {
			if (y < 0) {
				// - - 
				System.out.println(3);
			} else {
				// - +
				System.out.println(2);
			}
		} else {
			if (y < 0) {
				// + -
				System.out.println(4);
			} else {
				// + +
				System.out.println(1);
			}
		}
	}

}
