package quiz03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quiz03 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/FileIO_quiz_ex03/input.txt"); // 운영체제에 있는 파일 가져오기(byte로 가져옴)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8"); // byte-> 문자로 변환, 두 번째 파라미터는 문자 인코딩(한글 깨짐X)
			BufferedReader br = new BufferedReader(isr); // 한 줄씩 읽어 들이기 위함
			
			String readLine = br.readLine();
			Integer count = Integer.parseInt(readLine);
			for (int i = 0; i < count; i++) {
				readLine = br.readLine();
				Integer number = Integer.parseInt(readLine);

				printPrimeNumber(number);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printPrimeNumber(int number) {
		if (number == 2) {
			System.out.println(true);
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
	}

}
